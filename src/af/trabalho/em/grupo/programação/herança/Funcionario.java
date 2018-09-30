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
public class Funcionario extends Pessoa {
    private int idFuncionario;
    private String cargo;
    private float salario;
    private Date dataContratacao;

    public Funcionario(String nome, String sobrenome, Date dataNascimento, int idFuncionario, String cargo, float salario, Date dataContratacao) {
        super(nome, sobrenome, dataNascimento);
        setCargo(cargo);
        setSalario(salario);
        setDataContratacao(dataContratacao);
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
    
}
