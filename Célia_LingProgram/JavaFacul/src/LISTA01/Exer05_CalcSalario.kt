package LISTA01

import java.util.*

//Crie uma classe chamada “CalculadoraSalario” Java que:
//A. Seja executável.
//B. Solicite que o usuário digite o seu salário.
//C. Solicite a porcentagem de imposto que o usuário deverá pagar.
//D. Exiba o valor do salário líquido. Por exemplo:
//Se o salário for 1000,00, e o imposto for de 20%,
//o salário líquido será 800,00.

fun main() {
    val reader = Scanner(System.`in`);

    println("CalculadoraSalario")
    println("Insira o valor do seu salário: ")
    val salario: Double = reader.nextDouble()
    println("Insira o percentual de imposto que devará pagar: ")
    val imposto: Int = reader.nextInt()

    val valorDesconto =  salario * (imposto * 0.01)

    println("O salario líquido será R$" + (salario - valorDesconto))

}