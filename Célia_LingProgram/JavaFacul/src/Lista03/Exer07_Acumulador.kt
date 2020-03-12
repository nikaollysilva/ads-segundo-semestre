package Lista03

import kotlin.random.Random

//
//Criar uma classe chamada “Acumulador” que :
//Leia vários números até ler o número 0 e calcule a soma dos números lidos. (Não é para usar vetor)

fun main() {

    var sorteio = 4
    var a = 0

    do{
        val random = Random.nextInt(0, 6)
        a += sorteio
        println("Número: " + sorteio)

    }while (sorteio != 0)

    println("Total: " + a)
}