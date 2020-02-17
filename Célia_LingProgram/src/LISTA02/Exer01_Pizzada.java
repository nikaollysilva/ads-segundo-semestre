package LISTA02;

import java.util.Scanner;

public class Exer01_Pizzada {
    public static void main(String[] args) {

        Double preco, max, APagar;
        String sabor;
        Integer pessoas;

        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);


        System.out.println("CalculadoraPizza");
        System.out.println("Insira o valor de uma pizza:");
        preco = leitor.nextDouble();
        System.out.println("Insira o sabor da pizza:");
        sabor = leitorS.next();
        System.out.println("Insira a quantidade de pessoas que vão dividir " +
                "o valor da pizza:");
        pessoas = leitor.nextInt();
        System.out.println("Insira o valor maximo que cada um pode pagar" +
                " pela pizza:");
        max = leitor.nextDouble();

        APagar = preco / pessoas;

        if (APagar <= max) {
            System.out.println("A pizza de " + sabor + "será divida entre " +
                    pessoas + " pessoa(s). R$" + APagar + " para cada.");
        }else{
            System.out.println("Deu ruim no racha. A pizza deveria custar no" +
                    " máximo "+max+ " para cada um.");
        }
    }
}
