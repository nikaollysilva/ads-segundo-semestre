package LISTA01;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Double salarioUser;
        Double imposto;
        Double impostoDin;
        Double salarioLiq;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Exercício 05 - Calculadora de Sálario");
        System.out.println("Digite seu salário:");
        salarioUser = leitor.nextDouble();
        System.out.println("Insira a porcentagem de imposto que deve pagar:");
        imposto = leitor.nextDouble();

        impostoDin = salarioUser * (imposto * 0.010);
        salarioLiq = salarioUser - impostoDin;

        System.out.println("Salário liquido: R$" +salarioLiq);

    }
}
