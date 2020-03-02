package LISTA01

import java.util.*

//Crie uma classe chamada “Elevador” Java que:
//A. Seja executável.
//B. Solicite ao usuário o limite de peso de um elevador (número real).
//C. Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
//D. Solicite ao usuário o peso da 1ª pessoa que entrou no elevador
//(número real).
//E. Solicite ao usuário o peso da 2ª pessoa que entrou no elevador
//(número real).
//F. Solicite ao usuário o peso da 3ª pessoa que entrou no elevador
//(número real).
//Ao final, exiba uma frase assim: "Entraram 3 pessoas no elevador, no qual
//cabem X pessoas. O peso total no elevador é de Y, sendo que ele suporta Z
//". (onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas)

fun main() {
    val reader = Scanner(System.`in`)
    println("ELEVADOR")
    println("Insira o limite de peso do elevador: ")
    val limitePesoElevador: Double = reader.nextDouble()
    println("Insira o número limites de pessoas: ")
    val limitePessoas: Int = reader.nextInt()
    println("Insira o peso da primeira pessoa a subir no elevador: ")
    val primeiraPessoa: Double = reader.nextDouble()
    println("Insira o peso da segunda pessoa a subir no elevador: ")
    val segundaPessoa: Double = reader.nextDouble()
    println("Insira o peso da terceira pessoa a subir no elevador: ")
    val terceiraPessoa: Double = reader.nextDouble()

    val pesoTotal = primeiraPessoa + segundaPessoa + terceiraPessoa;

    println("Entraram 3 pessoas no elevador, no qual cabe " + limitePessoas + " pessoas." +
            "\n O peso total no elevador é de " + pesoTotal + "kg, sendo que ele suporta " + limitePesoElevador + "kg.")
}