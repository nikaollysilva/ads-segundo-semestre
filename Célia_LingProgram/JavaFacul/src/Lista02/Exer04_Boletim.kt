package Lista02

import java.util.*

//Crie uma classe chamada “Boletim” que:
//////A. Solicite a primeira nota.
//////B. Solicite a segunda nota.
//////C. Solicite a terceira nota.
//////D. Realize a média das notas informadas.
//////E. Exiba uma mensagem informando a situação do aluno baseado nos dados
//////abaixo:
//////a. Média 7 ou mais: exiba “passou direto”.
//////b. Média entre 5 e 7: exiba “têm direito de fazer uma prova de
//////recuperação”.
//////c. Abaixo de 5: exiba “reprovado direto”.

fun main() {

    val reader = Scanner(System.`in`)
    println("BOLETIM")
    println("Insira a primeira nota: ")
    val nota01: Double = reader.nextDouble()
    println("Insira a segunda nota: ")
    val nota02: Double = reader.nextDouble()
    println("Insira a terceira nota: ")
    val nota03: Double = reader.nextDouble()

    when((nota01 + nota02 + nota03) / 3){
        !in 0.0..10.0 -> println("Notas inválidas. Verifique e tente novamente.")
        in 0.0..4.9 -> println("Reprovado Direto.")
        in 5.0..7.0 -> println("Tem direito a fazer uma prova de recuperação.")
        in 7.0..10.0 -> print("Parabens! Passou direto.")
    }
}