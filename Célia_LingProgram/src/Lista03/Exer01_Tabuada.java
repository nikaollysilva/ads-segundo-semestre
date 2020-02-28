package Lista03;

import java.util.Scanner;

public class Exer01_Tabuada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("TABUADA");
        System.out.println("Insira um número:");
        Integer numero = leitor.nextInt();

        System.out.println("Tabuada do "+ numero);
        for (int i = 0; i <= 10; i++) {
            Integer result = i * numero;
            System.out.println(numero + " x " + i + " = " + result);
        }

    }
}
