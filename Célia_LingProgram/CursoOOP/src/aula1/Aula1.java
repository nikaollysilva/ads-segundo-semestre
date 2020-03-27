package aula1;

public class Aula1 {

    public  static  void  main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.modelo = "hostnet";
        c2.cor = "Preta";
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }

    public static class Caneta {
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
}

