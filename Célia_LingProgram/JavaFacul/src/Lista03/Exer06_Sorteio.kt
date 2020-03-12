package Lista03

import java.util.*
import kotlin.random.Random

//
//Crie uma classe chamada “Sorteio” que:
//Solicite um número de 1 a 100. Realize 200 sorteios. Ao final, exibir:
//Se o número do usuário foi sorteado (pela 1ª vez) e em qual sorteio. Quantos números pares foram sorteados. Quantos números ímpares foram sorteados
//Use interpolação p/ exibir o número com 2 casas decimais.

fun main() {
    val reader = Scanner(System.`in`)
    var random = -1
    var pares = 0
    var impares = 0
    var stop = true

    println("Insira um numero entre 1 e 100:")
    val number = reader.nextInt()

    for (i: Int in 1..200) {
        random = Random.nextInt(0, 100)

        if (number == random && stop) {
            println("Seu número foi sorteado!" +
                    "No sorteio Nº " + i)
            stop = false
        }
        if (random % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }

    println(" Pares: " + pares + "\n Impares: " + impares)

}