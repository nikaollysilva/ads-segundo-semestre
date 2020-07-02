package model.bean;

/**
 *
 * @author Nikaolly
 */
public class Categoria {

    private int id;
    private String descricao;
    
//    Dois construtores para nao ter que passar valor na instancia dele, ou seja
//    ha uma sobrecarga, sem id pq ele gera automaticamente;

    public Categoria() {
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
    }
    
//GET E SET
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
}
