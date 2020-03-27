package Lista03

import kotlin.random.Random

//
//Foi feita uma pesquisa para saber qual o sabor de pizza favorito entre os alunos da
//Faculdade. Para votar no sabor mussarela, deve-se digitar o valor 5, Para votar no sabor calabresa,
// deve-se digitar o valor 25, Para votar no sabor quatro queijos, deve-se digitar o valor 50.
// Elabore um programa em Java que leia os votos de 10 alunos diferentes
//(sem usar vetor) e exiba:
//a) Quantos votos obteve cada sabor. b) Qual o sabor favorito segundo a pesquisa.

fun main() {
    println("Pesquisa SABOR FAVORITO!\n"
            + "Qual o seu sabor favorito de pizza? \n"
            + "       Sabores  | Código \n"
            + "     Mussarela  |    5   \n"
            + "     Calabresa  |   25   \n"
            + "Quatro Queijos  |   50   \n")

    var M5 = 0
    var C25 = 0
    var Q50 = 0
    var i = 0

    while (i < 10) {
        val random = Random.nextInt(0, 3)

        when (random) {
            0 -> M5++
            1 -> C25++
            2 -> Q50++
        }
        i++
        println("-------------------------------\n" +
                 i +"ª Pessoa votou. \n" +
                "Total de votos: $i \n" +
                "Mussarela: $M5 \n" +
                "Calabresa: $C25 \n" +
                "Quatro-Queijos: $Q50\n")
    }

    print("O sabor preferido é ")

    if(M5 > C25 && M5 > Q50){
        println("Mussarela!")
    }else if(C25 > M5 && C25 > Q50){
        println("Calabresa!")
    }else{
        println("Quatro-Queijos!")
    }


}