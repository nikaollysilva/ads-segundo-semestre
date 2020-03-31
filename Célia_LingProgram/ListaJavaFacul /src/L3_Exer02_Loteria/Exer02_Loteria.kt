package Lista03

import java.util.*
import kotlin.random.Random

//Crie uma classe chamada “Loteria” que:
//Solicite um número entre 0 e 10 para o usuário.
//Tente advinhar o número digitado através de números randômicos(Random).
//A cada iteração exiba o número sorteado.
//Quando acontecer o “acerto” se a quantidade de vezes necessárias for:
//1. Até 3: exiba "Você é MUITO sortudo"
//2. Entre 4 e 10: exiba "Você é sortudo"
//3. Mais de 10: exiba "É melhor você ser trabalhador"

fun main() {
    val leitor = Scanner(System.`in`)

    println("Insira um numero entre 0 e 10:")
    val numero = leitor.nextInt()

    var random = -1
    var contador = 0

    while (numero != random) {
        random = Random.nextInt(0, 10)
        ++contador
        println(" sorteio: $contador sorteado: $random\n " +
                        "--------------------------------")
    }

    when (contador) {
        in 1..3 -> println("Você é MUITO sortudo!!")
        in 4..10 -> println("Você é sortudo!")
        !in 1..10 -> print("É melhor você ser trabalhador")
    }

}
