package L3_Exer07_Acumulador;

import java.util.Random;

public class Exer07_Acumulador {
    public static void main(String[] args) {
        Integer sorteio;
        Integer a = 0;

        Random aleatorio = new Random();

        do {
            sorteio = aleatorio.nextInt(6);
            a += sorteio;
            System.out.println("Número: " + sorteio);
//          System.out.println("Total:" +  a);
        } while (sorteio != 0);

        System.out.println("Total: " + a);

    }
}
