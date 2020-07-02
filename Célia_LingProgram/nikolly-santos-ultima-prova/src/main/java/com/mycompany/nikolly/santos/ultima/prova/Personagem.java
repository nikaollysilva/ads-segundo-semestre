package com.mycompany.nikolly.santos.ultima.prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikaolly
 */
public abstract class Personagem {

//    ATRIBUTOS
    protected String codinome;
    protected String nome;
    protected List<SuperPoder> poderes;

//    CONSTRUTOR
    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList<>();
    }
    
//    METODOS
    public void adicionaPoder(String nome, Integer categoria) {
        SuperPoder poder = new SuperPoder(nome, categoria);
        poderes.add(poder);
    }

    public abstract Double getForcaTotal();
    
//    TOSTRING
    @Override
    public String toString() {
        return "Personagem{" + "codinome=" + codinome + ", nome=" + nome + ", poderes=" + poderes + '}';
    }
    
//   GETTERS E SETTERS
    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
