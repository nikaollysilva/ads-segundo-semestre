package L5_Exer02_Lutadores;

public class Lutador {
    int vida;
    String nome = "", status = "";

    public Lutador() {
        this.vida = 100;
    }

    //    Get / Set
    public void setVida(Integer vida) {
        this.vida = vida;
    }
    public Integer getVida() {
        return this.vida;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public  void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }


//    Métodos
    public  void apanhar(){
        this.setVida(this.getVida() - 10);
    }
    public void concentrarEnergia(){
        this.setVida(this.getVida() + 2);
    }
    public void gerarStatus(){
        if (this.getVida() > 0){
            this.setStatus("Lutando");
        }
    }
}
