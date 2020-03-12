package Lista03

import java.util.*

//
//Elaborar um programa em Java que apresente como resultado o valor de uma potência de uma base qualquer elevada a um
// expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor do expoente. Considere apenas a entrada de
// valores inteiros e positivos. Por exemplo: B = 2 e E = 5. O programa deverá calcular e exibir o valor de 2 elevado a
// 5 = 32. (Não é para usar métodos que calculam a potência diretamente).

fun main() {
    val scanner = Scanner(System.`in`)
    println("Calcule a potencia")
    println("Insira sua base:")
    val base = scanner.nextInt()
    println("Insira seu expoente:")
    val expoente = scanner.nextInt()

    var a= base
    var contador = 1

    while(contador < expoente){
        a *= base
        println("$contador) ResulRod: " + a)
        contador++
    }

    println( "$base elevado a $expoente = $a")

}