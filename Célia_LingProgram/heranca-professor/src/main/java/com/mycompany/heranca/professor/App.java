package com.mycompany.heranca.professor;

/**
 *
 * @author Nikaolly
 */
public class App {

    public static void main(String[] args) {
        Professor professor = new Professor("Celia", Integer.SIZE, Integer.BYTES, Double.NaN);
        Coordenador coordenador = new Coordenador("Gerson", 17, 6, 22.0, 2, 22.0, "Análise e desenvolvimento de sistemas");

        professor.calculaSalario();
        System.out.println(professor);

        coordenador.calculaSalario();
        System.out.println(coordenador);
    }
}
