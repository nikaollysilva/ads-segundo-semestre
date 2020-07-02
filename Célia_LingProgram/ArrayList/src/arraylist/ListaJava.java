package arraylist;

/**
 *
 * @author Nikaolly
 */
import java.util.List;
import java.util.ArrayList;

public class ListaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List nomeLista = new ArrayList<>();

        nomeLista.add("Boa noite");
        nomeLista.add(100);
        nomeLista.add(11.99);
        nomeLista.add(false);

        System.out.println(nomeLista);
        System.out.println("Tamanho da Lista:" + nomeLista.size());
        System.out.println("Lista está vazia? " + nomeLista.isEmpty());
        System.out.println("Removendo item: " + nomeLista.remove(0));
        
//        Retorna o indice que a pesquisa esta
        System.out.println("Buscando item: " + nomeLista.indexOf(100));
        System.out.println("Pegando o ultimo elemento da lista: " + (nomeLista.size() - 1));

//        Removendo cada indice
        System.out.println("Lista antes de apagar: " + nomeLista);
        
        while (!nomeLista.isEmpty()){
            nomeLista.remove(0);
            System.out.println(nomeLista);
        }
    }

}
