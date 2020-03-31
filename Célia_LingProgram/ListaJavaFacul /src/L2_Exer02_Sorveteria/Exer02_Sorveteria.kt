package Lista02

import java.util.*

//Crie uma classe chamada “Sorveteria” que:
//A. Solicite o tipo de produto que o usuário deseja, opções:
//“Casquinha”, “Sundae” e “Milkshake”.
//B. Logo após, exiba o preço do produto sabendo que:
//a. casquinha custa R$ 2,00
//b. sundae custa R$ 5,00
//c. milkshake custa R$ 7,00.

fun main() {

    val reader = Scanner(System.`in`)

    println("Sorveteria")
    println("----PRODUTOS------- \n" +
            "1  |   Casquinha\n" +
            "2  |   Sundae\n" +
            "3  |   Milkshake\n" +
            "-------------------")
    println("Digite o código do Produto Desejado: ")
    val codProd: Int = reader.nextInt()
    val frase: String = "Total: R$"

    when (codProd) {
        1 -> println(frase + "2,00")
        2 -> println(frase + "5,00")
        3 -> println(frase + "7,00")
        else -> println("Código inválido.")
    }
}