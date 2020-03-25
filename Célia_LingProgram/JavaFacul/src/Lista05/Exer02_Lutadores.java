package Lista05;

public class Exer02_Lutadores {
    int vida;
    String nome = "", status = "";

    public Exer02_Lutadores() {
        this.vida = 100;
    }

    //    Get / Set
    public void setVida(Integer vida) {
        this.vida = vida;
    }
    public Integer getVida() {
        return vida;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public  void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
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
