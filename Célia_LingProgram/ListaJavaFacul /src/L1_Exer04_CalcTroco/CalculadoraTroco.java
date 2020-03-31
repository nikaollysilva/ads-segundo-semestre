package L1_Exer04_CalcTroco;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {

        Double valorProduto;
        Integer quantProduto;
        Double dinheiro;
        Double total;
        Double troco;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Exercicio 04 - Cálculo de Troco");
        System.out.println("Informe o valor unitário do produto:");
        valorProduto = leitor.nextDouble();
        System.out.println("Informe a quantidade vendida: ");
        quantProduto = leitor.nextInt();
        System.out.println("Informe o valor pago pelo cliete:");
        dinheiro = leitor.nextDouble();

        total = quantProduto * valorProduto;

        if (dinheiro < total) {
            System.out.println("Saldo insuficiente para a compra.");
        } else {

            troco = dinheiro - total;

            System.out.println("Seu troco será de R$" + troco);
        }

    }
}
