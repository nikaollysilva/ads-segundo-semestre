package LISTA01;

import java.util.Scanner;

public class Exer03_Elevador {
    public static void main(String[] args) {
        Double limitePeso;
        Integer limitePessoa;
        Double pesoPrimeiraPessoa;
        Double pesoSegundaPessoa;
        Double pesoTerceiraPessoa;
        Double totalPeso;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Exercício 03 - Elevador\n");
        System.out.println("Qual o limite de peso do elevador?");
        limitePeso = leitor.nextDouble();
        System.out.println("Qual o limite de pessoas que o elevador aguenta?");
        limitePessoa = leitor.nextInt();
        System.out.println("Qual o peso da 1ª pessoa a entrar?");
        pesoPrimeiraPessoa = leitor.nextDouble();
        System.out.println("Qual o peso da 2ª pessoa a entrar?");
        pesoSegundaPessoa = leitor.nextDouble();
        System.out.println("Qual o peso da 3ª pessoa a entrar?");
        pesoTerceiraPessoa = leitor.nextDouble();

        totalPeso = pesoPrimeiraPessoa + pesoSegundaPessoa + pesoTerceiraPessoa;

        System.out.println("\nEntraram 3 pessoas no elevador, no qual cabem " + limitePessoa +
                " pessoas. \n O peso total no elevador é de " + totalPeso + " sendo que ele suporta "+limitePeso + ".");
    }
}
