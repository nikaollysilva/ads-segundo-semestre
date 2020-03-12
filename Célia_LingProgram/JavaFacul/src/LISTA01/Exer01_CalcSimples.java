package LISTA01;

import java.util.Scanner;

public class Exer01_CalcSimples {


    public static void main(String[] args) {
        Double  num1, num2;
        Double soma;
        Double subtracao;
        Double multiplicacao;
        Double divisao;



        Scanner leitor = new Scanner(System.in);

        System.out.println("Exercício 01- Calculadora Simples \n");

        System.out.println("Digite um número:");
        num1 = leitor.nextDouble();
        System.out.println("Digite outro número:");
        num2 = leitor.nextDouble();


        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;


        System.out.println("Resultado da soma: \n" + soma);
        System.out.println("Resultado da subtração: \n" + subtracao);
        System.out.println("Resultado da multiplicação: \n" + multiplicacao);
        System.out.println("Resultado da divisão: \n" + divisao);

    }


}
