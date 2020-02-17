package LISTA02;

import java.util.Scanner;

public class Exer04_Boletim {
    public static void main(String[] args) {

        Double nota1, nota2, nota3, media;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Boletim");
        System.out.println("Insira a primeira nota:");
        nota1 = leitor.nextDouble();
        System.out.println("Insira a segunda nota:");
        nota2 = leitor.nextDouble();
        System.out.println("Insira a terceira nota:");
        nota3 = leitor.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;


        if (media >= 7) {
            System.out.println("Passou direto");
        } else if (media >= 5 && media <= 7) {
            System.out.println("Têm o direito de fazer uma prova de " +
                    "recuperação.");
        } else {
            System.out.println("Reprovado direto");
        }

        System.out.println(String.format("Sua média foi: %.1f ", media));
    }

}

