package Lista02

import java.util.*

//Crie uma classe chamada “IndiceMassaCorporal” que:
//A. Solicite a altura e peso do usuário.
//B. Solicite o sexo, deve ser:
//1 - Mulher
//2 - Homem.
//C. Calcule o IMC do usuário.
//D. Exiba a Condição de saúde da pessoa baseada em seu IMC.
//Use os valores desse site: http://www.lilianspeziali.com.br/tabela-de-imc/

fun main() {
    val reader = Scanner(System.`in`)
    println("Indice de Massa Corporal")
    println("Insira sua altura: ")
    val altura: Double = reader.nextDouble()
    println("Insira seu peso: ")
    val peso: Double = reader.nextDouble()
    println("___________________\n" +
            "1  | Mulher\n" +
            "2  | Homem")
    println("Insira o código referente ao seu sexo: ")
    val sexo: Int = reader.nextInt()

    val imc = peso / (altura * 2)
    println( """___________________
    Resultado: """)

    when (sexo) {
        1 -> when {
            imc < 19.1 -> println("Abaixo do peso.")
            imc < 25.8 -> println("No peso normal.")
            imc < 27.3 -> println("Marginalmente acima do peso.")
            imc < 32.3 -> println("Acima do peso ideal.")
            else -> {
                println("Obeso.")
            }
        }
        2 -> when {
            imc < 20.7 -> println("Abaixo do peso.")
            imc < 26.4 -> println("No peso normal.")
            imc < 27.8 -> println("Marginalmente acima do peso.")
            imc < 31.1 -> println("Acima do peso ideal.")
            else -> {
                println("Obeso.")
            }
        }
    }
}