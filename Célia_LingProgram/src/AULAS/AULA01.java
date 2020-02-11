package AULAS;

import java.util.Scanner;


public class AULA01 {
    public static void main(String[] args) {

        Integer num1, num2;
        Integer soma;
        String nomeTurma;
        Double nota, notaContinuada = 7.5;

        Scanner leitor = new Scanner(System.in);

        /*System.out.print("Boa\f noite meu amor!\n\n");
        System.out.println("Tudo bem?");

        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        System.out.println("Como vai, " + nome + "?");
*/

        System.out.println("Digite um número");
        num1 = leitor.nextInt();
        System.out.println("Digite outro numero");
        num2 = leitor.nextInt();

        soma = num1 + num2;
        System.out.println("A soma é " + soma);
        System.out.println("A multiplicação é " + (num1 * num2));

        System.out.println("Digite a sua nota");
        nota = leitor.nextDouble();
        System.out.println("A média é " + ((nota + notaContinuada)/2));

        System.out.println("Digite o nome da sua turma");
        nomeTurma = leitor.nextLine();

    }
}

