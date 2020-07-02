package com.mycompany.exemplo.classe.abstrata;

/**
 *
 * @author Nikaolly
 */
public abstract class Funcionario {
    
//    ATRIBUTO
    private String cpf;
    private String nome;

//    CONSTRUTOR
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
//    METODO ABSTRATO
    public abstract Double calcSalario();

//    TOSTRING
    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }

//    GET E SET
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
