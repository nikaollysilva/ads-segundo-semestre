package com.mycompany.exemplo.classe.abstrata;

/**
 *
 * @author Nikaolly
 */
public class Horista extends Funcionario {

//    ATRIBUTOS
    private Integer qtdHoras;
    private Double valorHora;
    
//CONSTRUTOR

    public Horista(String cpf, String nome, Integer qtdHoras, Double valorHora) {
        super(cpf, nome);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }
//METODO SOBRESCRITO

    @Override
    public Double calcSalario() {
        return qtdHoras * valorHora;
    }
//TOSTRING

    @Override
    public String toString() {
        return "Horista{" + super.toString() + "qtdHoras=" + qtdHoras
                + ", valorHora=" + valorHora + ", salario=" + calcSalario() + '}';
    }
//GET E SET

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}
