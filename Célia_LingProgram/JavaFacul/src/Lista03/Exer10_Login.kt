package Lista03

import java.util.*

//
//Elaborar um programa java que simule a autenticação de um usuário em um sistema. Solicite o nome de usuário e senha.
// Enquanto o nome for diferente de “admin” e a senha for diferente de “#Bandtec” exiba: “Login e/ou senha inválidos” e
// solicite novamente.
// Caso o usuário digite os campos corretamente, exiba: “Login realizado com sucesso”

fun main() {
    val scanner = Scanner(System.`in`)

    println("Login")
    println("Insira seu usuário: ")
    val usuario = scanner.nextLine()
    println("Insira sua senha: ")
    val senha = scanner.nextLine()

    if(usuario.equals("admin") && senha.equals("#Bandtec")){
        println("Login realizado com sucesso!")
    }else{
        println("Login e/ou senha inválidos.")
    }
}