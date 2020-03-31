package L1_Exer02_Idade;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        String nome;
        Integer anoNasc;
        Integer idadeFut;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Exercícios 02 - Idade\n");
        System.out.println("Qual o seu nome?");
        nome = leitor.nextLine();
        System.out.println("Olá, " +nome+ "! Qual o ano de seu nascimento?");
        anoNasc = leitor.nextInt();
        idadeFut = 2030 - anoNasc;
        System.out.println("Em 2030 você terá " +idadeFut+ " anos");

    }
}
