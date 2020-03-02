package Lista03;

import java.util.Random;
import java.util.Scanner;

public class Exer02_Loteria {
    public static void main(String[] args) {
        Integer contador = 0;

        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Insira um número entre 0 e 10:");
        Integer numero = leitor.nextInt();

//        System.out.println("numero);

        Integer valorDado = null;

        while(numero != valorDado){
            valorDado = aleatorio.nextInt(10);
            contador++;
            System.out.println(contador+"º Numero sorteado: "+valorDado);
        }

        if(contador <= 3){
            System.out.println("Voce é muito sortudo!");
        }else if(contador >= 4 && contador <= 10){
            System.out.println("Voce é sortudo");
        }else{
            System.out.println("É melhor voce ser trabalhador");
        }

    }
}
