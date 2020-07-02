package com.mycompany.exemplo.classe.abstrata;

/**
 *
 * @author Nikaolly
 */
public class Vendedor extends Funcionario{
    
//    ATRIBUTOS
    private Double vendas;
    private Double taxa;

//    CONSTRUTOR
    public Vendedor( String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

//   METODOS    
    @Override
    public Double calcSalario() {
     return vendas*taxa;
    }

//    TOSTRING
    @Override
    public String toString() {
        return "Vendedor{" + super.toString() +"vendas=" + vendas + ", taxa=" + taxa + 
                ", salario"+ calcSalario()+'}';
    }

//    GET E SET
    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    
}

