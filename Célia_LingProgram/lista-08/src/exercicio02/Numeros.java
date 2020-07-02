//2.Crie um programa em Java o qual:
//a) Solicite ao usuário que digite números inteiros e os adicione em uma lista,
//somente pare de perguntar um novo número quando o usuário digitar 0. 
//b) Exiba somente os pares da lista.. 
//c) Exiba somente os ímpares da lista. 
//d) Exiba a soma de todos os números da lista. 
//e) Exiba somente o menor número da lista. 
//f) Exiba somente o maior número da lista
package exercicio02;

import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author Nikaolly
 */
public class Numeros {

    List<Integer> lista = new ArrayList<>();

    public void adicionarNumerosAuto() {

        for (int i = 2; i >= 0; i--) {
            lista.add(i);
        }
        lista.add(12);

        for (int i = 0; i <= 2; i++) {
            lista.add(i);
        }

        System.out.println(lista);

    }

    public void acharMaiorNumero() {
        Integer a = 0;
        for (Integer I : lista) {

            if (I > a) {
                a = I;
            }
        }

        System.out.println("Maior numero: " + a);
    }

    public void somarIndices() {
        Integer a = 0;
        for (Integer I : lista) {
            a+=I;
        }
        System.out.println("Soma da lista toda: " + a );
    }

    public static void main(String[] args) {
        Numeros n1 = new Numeros();
        n1.adicionarNumerosAuto();
        n1.acharMaiorNumero();
        n1.somarIndices();
    }

}
