package aula06_Encapsulamento;

public class Start {
    public static void main(String[] args){
        ControleRemoto c = new ControleRemoto();

        c.ligar();

        c.maisvolume();
        c.ligarMudo();


        c.abrirMenu();
    }
}
