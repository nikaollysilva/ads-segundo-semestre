package com.mycompany.help;

/**
 *
 * @author diego
 */
public class Aluno {

    private String nome;
    private Integer ra;
    private Endereco endereco;
    private Boolean ativo;

    public Aluno(String nome, Integer ra, Endereco endereco) {
        this.nome = nome;
        this.ra = ra;
        this.endereco = endereco;
        this.ativo = true;
    }

    public void exibeStatusAluno() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("RA: %d", this.ra));
        System.out.println(String.format("Ativo: %s", this.ativo));
        endereco.exibeEndereço();
    }

    public void ativarOuInativar() {
        this.ativo = !this.ativo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getRa() {
        return ra;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
