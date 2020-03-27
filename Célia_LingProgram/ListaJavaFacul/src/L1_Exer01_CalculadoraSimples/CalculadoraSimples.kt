package L1_Exer01_CalculadoraSimples

import java.util.*

//Crie uma classe chamada “Calculadora” Java que:
//A. Seja executável (possui o método main).
// B. Solicite um número para o usuário(número real).
// C. Solicite outro número para o usuário(número real).
// D. Calcule e exiba a soma dos dois números digitados.
// E. Calcule e exiba a subtração do primeiro número pelo segundo.
// F. Calcule e exiba a multiplicação do primeiro número pelo segundo.
// G. Calcule e exiba a divisão do primeiro número pelo segundo.
// Exemplo:
//Digite um número:
//10
//Digite outro número:
//4
//Resultado da soma:
//14.0
//Resultado da subtração:
//6.0
//Resultado da multiplicação:
//40.0
//Resultado da divisão:
//2.5

fun main() {

    val reader = Scanner(System.`in`)
    println("CALCULADORA")
    println("Insira um número: ")
    val number1: Int = reader.nextInt()
    println("Insira um segundo número: ")
    val number2: Int = reader.nextInt()
    soma(number1, number2)
    adicao(number1, number2)
    mult(number1, number2)
    divisao(number1, number2)

}

val frase = "O resultado da ";
fun soma(number1: Int, number2: Int) = println(frase + "soma: " + (number1 + number2))
fun adicao(number1: Int, number2: Int) = println(frase + "adição: " + (number1 - number2))
fun mult(number1: Int, number2: Int) = println(frase + "multiplicação: " + (number1 * number2))
fun divisao(number1: Int, number2: Int) = println(frase + "divisão: " + (number1 / number2))