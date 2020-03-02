package Lista02;

import java.util.Scanner;

public class Exer05_IMC {
    public static void main(String[] args) {

        Double altura, peso, imc;
        Integer sexo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Indice de Massa Corporal");
        System.out.println("Insira sua altura:");
        altura = leitor.nextDouble();
        System.out.println("Insira se peso:");
        peso = leitor.nextDouble();
        System.out.println("Insira seu sexo: \n" +
                "1- Feminino. \n" +
                "2- Masculino.");
        sexo = leitor.nextInt();

        imc = peso /(altura * 2);

        switch (sexo){
            case 1:
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imc > 19.1 && imc < 25.8) {
                System.out.println("No peso normal");
            } else if (imc > 25.8 && imc < 27.3) {
                System.out.println("Marginalmente acima do peso");
            } else if (imc > 27.3 && imc < 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
            break;

            case 2:

            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imc > 20.7 && imc < 26.4) {
                System.out.println("No peso normal");
            } else if (imc > 26.4 && imc < 27.8) {
                System.out.println("Marginalmente acima do peso");
            } else if (imc > 27.8 && imc < 31.1) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
            break;

            default:
            System.out.println("Selecione um dos Sexos Válidos");
            break;

        }

        System.out.println("Seu imc é: "+ imc);
    }
}
