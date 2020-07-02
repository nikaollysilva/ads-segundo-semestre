package lista.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nikaolly
 */
public class ListaString {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um nome: ");
            String nome = leitor.nextLine();
            lista.add(nome);
        }

        System.out.println("Lista: " + lista);

//        Percorrendo a lista for tradicional
        System.out.println("EXIBINDO CADA INDEX DA LISTA");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("EXIBINDO A LISTA COM O FOR ENHANCED");
        for(String banana: lista){
            System.out.println(banana);
        }
        
        System.out.println(100 * 0.1);
    }

}
