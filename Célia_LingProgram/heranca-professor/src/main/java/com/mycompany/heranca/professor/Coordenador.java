package com.mycompany.heranca.professor;

/**
 *
 * @author Nikaolly
 */
public class Coordenador extends Professor {

    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(String nome, Integer codigo, Integer horas, Double valorHora, Integer qtdHorasCoord, Double valorHoraCoord, String curso) {
        super(nome, codigo, horas, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    @Override
    public Double calculaSalario() {
        return ((horas * valorHora) * 4.5) + ((qtdHorasCoord * valorHoraCoord) * 4.5) ;
    }

    @Override
    public String toString() {
        return "Coordenador{"+ super.toString() + "qtdHorasCoord=" + qtdHorasCoord + ", valorHoraCoord=" + valorHoraCoord + ", curso=" + curso + '}';
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
