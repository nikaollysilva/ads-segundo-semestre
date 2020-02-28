package Lista03;

import java.util.Random;
import java.util.Scanner;

public class Exer06_Sorteio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Insira um numero de 1 a 100:");
        Integer numero = leitor.nextInt();

        Integer sorteado = null;
        Integer contador = 1;
        Integer pares = 0;
        Integer impares = 0;
        boolean stop = false;

        while (contador <= 200) {
            sorteado = aleatorio.nextInt(99 + 1);

            if (numero == sorteado && stop == false) {
                    System.out.println("Seu número foi sorteado!" +
                            " No sorteio Nº" + contador);
                    stop = true;
            }

            if (sorteado % 2 == 0) {
                pares++;
            } else if (sorteado % 2 != 0) {
                impares++;
            }

            contador++;

        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }

}

