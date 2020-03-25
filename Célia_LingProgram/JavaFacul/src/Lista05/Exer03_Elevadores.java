package Lista05;

public class Exer03_Elevadores {
    double pesoTotal = 0.0;
    int quantidadePessoas = 0;


//Get/Set
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    public void setQuantidadePessoas( int quantidadePessoas){
        this.quantidadePessoas = quantidadePessoas;
    }

    void entrarHomem(){
        this.setQuantidadePessoas(getQuantidadePessoas()+1);
        this.setPesoTotal(getPesoTotal()+90);
    }

    void entrarMulher(){
        this.setQuantidadePessoas(getQuantidadePessoas()+1);
        this.setPesoTotal(getPesoTotal()+65);
    }

    void entrarCrianca(){
        this.setQuantidadePessoas(getQuantidadePessoas()+1);
        this.setPesoTotal(getPesoTotal()+40);
    }
}
