package L3_Exer09_Potencia;

import java.util.Scanner;

public class Exer09_Potencia {
    public static void main(String[] args) {
        Integer base, expoente, contador = 1, a;


        Scanner leitor = new Scanner(System.in);
        System.out.println("---Calcule a Potência---");
        System.out.println("Insira a base:");
        base = leitor.nextInt();
        System.out.println("Insira o expoente:");
        expoente = leitor.nextInt();
        a = base;

        while (contador < expoente) {
            a *= base;
            System.out.println(contador + ") resulRod: " + a);
            contador++;
        }
        System.out.println(base + " elevado a " + expoente + " = " + a);
    }
}
