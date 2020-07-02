/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02;

import java.util.Scanner;

/**
 *
 * @author Nikaolly
 */
public class Calcular {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("---------------------------------------------------\n"
                + "CALCULADORA");
        System.out.println("Digite o primeiro numero:");
        calc.setA(leitor.next());
        System.out.println("Digite o segundo numero:");
        calc.setB(leitor.next());

        System.out.println("RESULTADOS");
        calc.somar();
        System.out.println(calc.getA() + " + " + calc.getB() + " = " + calc.getResult());
        calc.Subtrair();
        System.out.println(calc.getA() + " - " + calc.getB() + " = " + calc.getResult());
        calc.dividir();
        System.out.println(calc.getA() + " / " + calc.getB() + " = " + calc.getResult());
        calc.multiplicar();
        System.out.println(calc.getA() + " * " + calc.getB() + " = " + calc.getResult());
        System.out.println("---------------------------------------------------");
    }
}
