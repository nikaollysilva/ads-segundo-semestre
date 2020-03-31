package L3_Exer10_Login;

import java.util.Scanner;

public class Exer10_Login {
// Elaborar um programa java que simule a autenticação de um
// usuário em um sistema. Solicite o nome de usuário e senha.
// Enquanto o nome for diferente de “admin” e a senha for diferente
// de “#Bandtec” exiba: “Login e/ou senha inválidos” e solicite novamente.
// Caso o usuário digite os campos corretamente, exiba: “Login realizado
// com sucesso
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu login");
        String login = leitor.nextLine();
        System.out.println("Insira sua senha");
        String senha = leitor.nextLine();

        if(login.equals("admin") && senha.equals("#Bandtec")){
            System.out.println("Login realizado com sucesso!");
        }else{
            System.out.println("Login e /ou senha inválidos");
        }

    }
}
