/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telacorredor;

/**
 *
 * @author Nikaolly
 */
public class Corredor {
    protected String tipofisico;
    protected String permance;
    protected Double tempoMedio;

    public Corredor(String tipofisico, String permance, Double tempoMedio) {
        this.tipofisico = tipofisico;
        this.permance = permance;
        this.tempoMedio = tempoMedio;
    }

    @Override
    public String toString() {
        return "Corredor{" + "tipofisico=" + tipofisico + ", permance=" + permance + ", tempoMedio=" + tempoMedio + '}';
    }

    public String getTipofisico() {
        return tipofisico;
    }

    public void setTipofisico(String tipofisico) {
        this.tipofisico = tipofisico;
    }

    public String getPermance() {
        return permance;
    }

    public void setPermance(String permance) {
        this.permance = permance;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(Double tempoMedio) {
        this.tempoMedio = tempoMedio;
    }
    
    
    
}
