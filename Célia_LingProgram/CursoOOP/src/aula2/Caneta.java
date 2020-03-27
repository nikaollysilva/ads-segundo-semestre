package aula2;


public  class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Aula1.Caneta do modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta de ponta " + this.ponta);
        System.out.println("esta tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não é possivel rabiscar com a caneta tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}

