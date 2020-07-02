package model.bean;

/**
 *
 * @author Nikaolly
 */
public class Produto {

    private int id;
    private String descricao;
    private int qtd;
    private double valor;
    private Categoria categoria;
    
//    Dois construtores para nao ter que passar valor na instancia dele, ou seja
//    ha uma sobrecarga, sem id pq ele gera automaticamente;
    public Produto() {
    }

    public Produto(String descricao, int qtd, double valor, Categoria categoria) {
        this.descricao = descricao;
        this.qtd = qtd;
        this.valor = valor;
        this.categoria = categoria;
    }

//    GET E SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
