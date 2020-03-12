package Lista03

import java.util.*

//Crie uma classe chamada “Tabuada” que:
//1. Solicite um número para o usuário.
//2. Exiba a tabuada correspondente ao número digitado.
//Exemplo:
//2
//2 x 0 = 0
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20

fun main() {

     val leitor = Scanner(System.`in`)

    println("Insira um número: ")
    val numero: Int = leitor.nextInt()

    for(contador in 1..10){
        println("$numero X $contador  = ${numero*contador}")
    }
}