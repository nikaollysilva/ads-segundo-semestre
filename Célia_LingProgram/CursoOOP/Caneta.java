public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta de ponta " + this.ponta);
        System.out.println("esta tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não é possivel rabiscar com a caneta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
