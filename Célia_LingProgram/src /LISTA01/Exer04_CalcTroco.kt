package LISTA01

import java.util.*

//Crie uma classe chamada “CalculadoraTroco” Java que:
//A. Seja executável.
//B. Solicite o valor unitário de um produto.
//C. Solicite a quantidade vendida.
//D. Solicite o valor pago pelo cliente.
//E. Calcule e exiba o troco com a seguinte frase.
//"Seu troco será de R$ X
fun main() {
    val reader = Scanner(System.`in`)

    println("Calculando Troco")
    println("Insira o valor do produto: ")
    val valorProduto: Double = reader.nextDouble()
    println("Insira a quantidade vendida: ")
    val quantidadeVendida: Int = reader.nextInt()
    println("Insira o valor pago pelo cliente: ")
    val valorPago: Double = reader.nextDouble()

    val totalProdutos: Double = valorProduto * quantidadeVendida

    println("Seu troco será de R$" + (valorPago-totalProdutos))
}
