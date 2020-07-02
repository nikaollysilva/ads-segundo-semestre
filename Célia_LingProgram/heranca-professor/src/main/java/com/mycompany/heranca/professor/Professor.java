package com.mycompany.heranca.professor;

/**
 *
 * @author Nikaolly
 */
public class Professor {

    protected String nome;
    protected Integer codigo;
    protected Integer horas;
    protected Double valorHora;

    public Professor(String nome, Integer codigo, Integer horas, Double valorHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public Double calculaSalario() {
        return (horas * valorHora) * 4.5;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", codigo=" + codigo + ", horas=" + horas + ", valorHora=" + valorHora + '}';
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}
