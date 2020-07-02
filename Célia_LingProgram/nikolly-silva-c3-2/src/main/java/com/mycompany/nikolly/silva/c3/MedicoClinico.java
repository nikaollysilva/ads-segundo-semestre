package com.mycompany.nikolly.silva.c3;

/**
 *
 * @author Nikaolly
 */
public class MedicoClinico extends Medico{
   private Integer consultas;
   private Double valorConsulta;

    public MedicoClinico(Integer codigo, String nome, Integer consultas, Double valorConsulta) {
        super(codigo, nome);
        this.consultas = consultas;
        this.valorConsulta = valorConsulta;
    }

    @Override
    public Double calculaSalario() {
        return consultas * valorConsulta;
    }

    @Override
    public String toString() {
        return "Médico Clinico: \n" + super.toString()+ " Consultas:" + consultas + "\n ValorConsulta: R$" + valorConsulta;
    }
   
    public Integer getConsultas() {
        return consultas;
    }

    public void setConsultas(Integer consultas) {
        this.consultas = consultas;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
