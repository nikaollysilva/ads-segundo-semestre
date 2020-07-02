package com.mycompany.nikolly.silva.c2;

/**
 *
 * @author Nikaolly
 */
public class App {
    private String nome;
    private String categoria;
    private Double tamanho_GB;

//    CONSTRUTOR
    public App(String nome, String categoria, Double tamanho_GB) {
        this.nome = nome;
        this.categoria = categoria;
        this.tamanho_GB = tamanho_GB;
    }

//    METODO
    public void exibeDados(){
        System.out.println(String.format("---------------Dados do Aplicativo---------------- \n"
                                       + "   Nome: %s \n"
                                       + "   Categoria: %s \n"
                                       + "   Tamanho: %.1f(GB) \n"
                                       + "--------------------------------------------------",
                getNome(), getCategoria(), getTamanho_GB()));
    }
    
//    TO_STRING    
    @Override
    public String toString() {
        return "\n Nome: " + nome + "  |  Categoria: " + categoria + "  |    Tamanho(GB): " + tamanho_GB;
    }
    
//GET E SET    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getTamanho_GB() {
        return tamanho_GB;
    }

    public void setTamanho_GB(Double tamanho_GB) {
        this.tamanho_GB = tamanho_GB;
    }
}
