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
public class Pessoa {
    private String nome, sobrenome;
    private Date dataNascimento;
    
    public Pessoa(String nome, String sobrenome, Date dataNascimento) {
        setNome(nome);
        setSobrenome(sobrenome);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    


}
