package com.mycompany.help;

/**
 *
 * @author diego
 */
public class Teste {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Haddock Lobo", "Jardins", 595, "São Paulo");
        Endereco endereco2 = new Endereco("Peixoto Gomide", "Jardins", 343, "São Paulo");

        Aluno aluno1 = new Aluno("Diego Brito", 50000, endereco1);
        Aluno aluno2 = new Aluno("Nikolly", 50001, endereco2);

        aluno1.exibeStatusAluno();
        System.out.println("--------");
        aluno2.exibeStatusAluno();
        
        System.out.println("");
        
        System.out.println("Recuperando itens individualmente através do getter");
        
        System.out.println("");
        
        //Pegando somente rua do aluno 1
        System.out.println(String.format("Rua do aluno 01: %s", aluno1.getEndereco().getRua()));
        System.out.println("");
        //Pegando somente numero do aluno 2
        System.out.println(String.format("Rua do aluno 01: %s", aluno2.getEndereco().getNumero()));

        
    }
}
