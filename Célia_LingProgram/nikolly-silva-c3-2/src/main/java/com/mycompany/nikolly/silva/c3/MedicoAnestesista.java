package com.mycompany.nikolly.silva.c3;

/**
 *
 * @author Nikaolly
 */
public class MedicoAnestesista extends Medico {

    private Integer anestesias;
    private Double valorAnestesia; 

    public MedicoAnestesista(Integer codigo, String nome, Integer anestesias, Double valorAnestesia) {
        super(codigo, nome);
        this.anestesias = anestesias;
        this.valorAnestesia = valorAnestesia;
    }
    
    @Override
    public Double calculaSalario() {
     return anestesias * valorAnestesia;
    }

    @Override
    public String toString() {
        return "Médico Anestesista: \n" + super.toString() + " Anestesias:" + anestesias + "\n ValorAnestesia: R$" + valorAnestesia;
    }

    public Integer getAnestesias() {
        return anestesias;
    }

    public void setAnestesias(Integer anestesias) {
        this.anestesias = anestesias;
    }

    public Double getValorAnestesia() {
        return valorAnestesia;
    }

    public void setValorAnestesia(Double valorAnestesia) {
        this.valorAnestesia = valorAnestesia;
    }
}
