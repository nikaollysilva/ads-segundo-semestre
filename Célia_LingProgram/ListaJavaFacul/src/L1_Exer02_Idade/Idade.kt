package L1_Exer02_Idade

import java.util.*

//Crie uma classe chamada “Idade” Java que:
//A. Seja executável.
//B. Solicite que o usuário digite o seu nome.
//C. Em seguida, o programa deverá exibir a mensagem:
//“Olá, Fulano! Qual o ano de seu nascimento?”.
//D. Depois, o programa deverá exibir:
//“Em 2030 você terá 25 anos” (sendo Fulano o nome digitado pelo
//usuário e xx a idade
//do usuário).

fun main() {
    val reader = Scanner(System.`in`)

    println("IDADE")
    println("Digite seu nome: ")
    val nome: String = reader.nextLine()
    println("Olá, " + nome + "! Qual o ano do seu nascimento?")
    val anoNasc: Int = reader.nextInt()
    println("Em 2030 voce terá " + (2030 - anoNasc) + " anos")

}