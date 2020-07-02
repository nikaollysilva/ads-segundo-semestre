package com.mycompany.heranca.aluno;

/**
 *
 * @author Nikaolly
 */
public class AlunosPos extends Aluno{
    
    private Double notaMonografia;

    public AlunosPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
//        return super.calculaMedia(); //To change body of generated methods, choose Tools | Templates.
          return (notaContinuada+notaSemestral+notaMonografia)/3;
    }

    @Override
    public String toString() {
        return "AlunosPos{" + "Aluno:" + super.toString() + "notaMonografia=" + notaMonografia + '}';
    }
    
    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }   
}
