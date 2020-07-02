package com.mycompany.nikolly.santos.ultima.prova;

/**
 *
 * @author Nikaolly
 */
public class Vilao extends Personagem {

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double somaPoderes = 0.0;

        for (SuperPoder s : poderes) {
            somaPoderes += s.getCategoria();
        }

        return somaPoderes;
    }

}
