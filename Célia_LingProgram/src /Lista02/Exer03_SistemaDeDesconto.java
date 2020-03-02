package Lista02;

import java.util.Scanner;

public class Exer03_SistemaDeDesconto {
    public static void main(String[] args) {

        Double valor, desconto = 0.0, valorADesc;
        Integer codigo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Desconto");
        System.out.println("Insira o valor do produto escolhido");
        valor = leitor.nextDouble();
        System.out.println("Insira o codigo de desconto");
        codigo = leitor.nextInt();

        switch (codigo) {
            case 1:
                desconto = 0.05;
                break;
            case 2:
                desconto = 0.1;
                break;
            case 3:
                desconto = 0.2;
                break;
            case 4:
                desconto = 0.5;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        if (desconto > 0) {
            valorADesc = desconto * valor;
            System.out.println("Valor sem desconto: R$"+valor);
            System.out.println("Valor com desconto: R$" + (valor - valorADesc) );
            System.out.println("Voce economiza R$"+ valorADesc);
        } else {
            System.out.println("Solicite o desconto novamente");
        }




    }
}
