/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.trabalho.em.grupo.programação.herança;

import java.util.Date;

/**
 *
 * @author João André
 */
public class Cliente extends Pessoa {
    private int idCliente;
    private String email;

    public Cliente(String nome, String sobrenome, Date dataNascimento, int idCliente, String email) {
        super(nome, sobrenome, dataNascimento);
        setIdCliente(idCliente);
        setEmail(email);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
