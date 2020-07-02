package com.mycompany.nikolly.silva.c3;

/**
 *
 * @author Nikaolly
 */
public abstract class Medico {
    private Integer codigo;
    private String nome;

    public Medico(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public abstract Double calculaSalario();

    @Override
    public String toString() {
        return "Código:" + codigo + "\n Nome:" + nome+ "\n";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
