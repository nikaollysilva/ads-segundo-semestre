/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.estrutura.repeticao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExemploEstruturaRepeticaoo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;

//        Exemplo while
        Integer cont = 1;
        while (cont <= 6) {
            System.out.println(cont + ") Boa noite!");
            cont += 2;
        }

        System.out.print("contador agr é:" + cont);

//        Exemplo for
        for (int i = 1; i <= 6; i++) {
            System.out.println("i=" + i);
        }

//        Exemplo de do-while
//        cont = 5;
//        do {
//            System.out.println("cont=" + cont);
//            cont--;
//        } while (cont >= 0);

        //Exemplo de validacao usando do-while
//        do {
//            System.out.println("Digite um numero positivo:");
//            numero = leitor.nextInt();
//        } while (numero < 0);

        //Exemplo de validacao usando while
//        System.out.println("Digite um número positivo:");
//        numero = leitor.nextInt();
//        while (numero < 0) {
//            System.out.println("Numero invalido! Digite novamente");
//            numero = leitor.nextInt();
//        }

        //Exemplo de validacao usando while
//        numero = -1;
//        while (numero < 0) {
//            System.out.println("Digite um número positivo");
//            numero = leitor.nextInt();
//        }

//       Solicitar que o usuario digite 5 numeros, ler e soma-los e depois exibir a soma dos valores digitados
        Integer soma = 0;
        for (Integer i = 1; i <= 5; i++) {

            System.out.println("Digite um número:");
            numero = leitor.nextInt();

            soma += numero;
            System.out.println((i) + ") "+"Número digitado: " + numero);

        }
        System.out.println("O Resultado " + soma);

    }

}
