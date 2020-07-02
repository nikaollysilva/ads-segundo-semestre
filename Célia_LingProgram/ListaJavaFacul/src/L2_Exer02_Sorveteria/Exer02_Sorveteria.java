package L2_Exer02_Sorveteria;

import java.util.Scanner;

public class Exer02_Sorveteria {
    public static void main(String[] args) {

        Integer produto;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Sorveteria");
        System.out.println("Insira qual produto deseja: \n" +
                "1 - Casquinha \n" +
                "2 - Sundae \n" +
                "3 - Milkshake\n");

        produto = leitor.nextInt();

        switch (produto){
            case 1:
                System.out.println("Produto escolhido: Casquinha \n Valor: R$2,00");
                break;
            case 2:
                System.out.println("Produto escolhido: Sundae\n Valor: R$5,00");
                break;
            case 3:
                System.out.println("Produto escolhido: Milkshake\n Valor: R$7,00");
                break;

        }
    }
}
