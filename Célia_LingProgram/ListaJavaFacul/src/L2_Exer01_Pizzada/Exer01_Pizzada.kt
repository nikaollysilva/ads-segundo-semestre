package Lista02

import java.util.*

//Crie uma classe chamada “CalculadoraPizza” que:
//A. Solicite o valor de uma pizza.
//B. Solicite o sabor da pizza.
//C. Solicite a quantidade de pessoas que irá "rachar" a conta.
//D. Solicite o valor máximo que as pessoas aceitam "rachar" .
//E. Caso o valor da pizza seja possível de "rachar", Exibir:
//“A pizza de SABOR será dividida entre X pessoas. R$VALOR p/ cada"
//F. Caso o "racha" seja impossível exibir:
//"Deu ruim no racha. A pizza deveria custar no máximo X"
//Onde X é o valor máximo que uma pizza pode custar.

fun main() {

    val reader = Scanner(System.`in`)
    val readerString = Scanner(System.`in`)

    println("CalCuladoraPizza")
    println("Insira o valor da pizza: ")
    val valorPizza: Double = reader.nextDouble()
    println("Insira o sabor da pizza: ")
    val saborPizza: String = readerString.nextLine()
    println("Insira quantas pessoas irão rachar: ")
    val quantPessoas: Int = reader.nextInt()
    println("Insira o valor máximo que cada um aceita pagar: ")
    val valorRacha: Double = reader.nextDouble()

    val valorPagar: Double = valorPizza / quantPessoas

    if (valorPagar > valorRacha) {
        println("Deu ruim no racha. A pizza deveria custar no máximo " + valorRacha)
    } else {
        println("A pizza de " + saborPizza + " será dividida entre " + quantPessoas + " pessoas. R$" + valorPagar + " p/ cada")
    }
}