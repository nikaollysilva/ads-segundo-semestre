package Lista02

import java.util.*

//Crie uma classe chamada “Desconto” que:
//A. Solicite o valor do produto escolhido.
//B. Solicite o código de desconto.
//O desconto deve ser calculado de acordo com o código fornecido,
//conforme a tabela
//abaixo:
//Código Desconto
//Desconto
//1 5%
//2 10%
//3 20%
//4 50%
//C. Exiba o valor do produto sem desconto.
//D. Exiba o valor do produto com o desconto.
//E. Exiba uma mensagem de código inválido caso o usuário digite um código
//inexistente. Dica: utilize o switch/case

fun main() {
    val reader = Scanner(System.`in`)

    println("Desconto")
    println("Insira o valor do seu produto: ")
    val valorProd: Double = reader.nextDouble()
    println("Insira o código de desconto: ")
    val codDesc: Int = reader.nextInt()

    when (codDesc) {
        1 -> println("Valor sem desconto: R$" + valorProd + "\n Valor com desconto: R$" + (valorProd - (valorProd * 0.05)))
        2 -> println("Valor sem desconto: R$" + valorProd + "\n Valor com desconto: R$" + (valorProd - (valorProd * 0.10)))
        3 -> println("Valor sem desconto: R$" + valorProd + "\n Valor com desconto: R$" + (valorProd - (valorProd * 0.20)))
        4 -> println("Valor sem desconto: R$" + valorProd + "\n Valor com desconto: R$" + (valorProd - (valorProd * 0.50)))
        else -> println("Código de desconto inválido.")
    }
}