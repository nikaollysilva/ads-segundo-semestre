//1.Crie um Programa em Java o qual:
//a) Tenha uma lista de frutas a qual o usuário não vê. 
//b) Tenha uma tela (JFrame) na qual o usuário digita o nome de uma fruta e um 
//botão "Pesquisar". 
//c) Ao clicar nesse botão, o programa busca essa fruta na lista 
//(essa busca diferencia maiúsculas e minúsculas). 
//Se achar, exibe um texto abaixo com uma frase como esta:
//A fruta X existe na lista. 
//d) Caso a fruta pesquisada não exista, exiba:
//Não existe a fruta X na lista. obs. O exercício pode ser feito com console da 
//mesma forma.
package exercicio01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikaolly
 */
public class Frutas {

    private String inputFrutas;
    private String mensagem;
    private String cor = "#000000";

    public void buscarFrutas() {
        List<String> deposito = new ArrayList<>();
        deposito.add("Morango");
        deposito.add("Laranja");
        deposito.add("Atemoia");
        deposito.add("Uva");

        System.out.println(deposito);

        Integer validacao = 0;
        for (String d : deposito) {
            System.out.println(d);
            if (d.equals(getInputFrutas())) {
                validacao++;
            }
        }
        if (validacao != 0) {
            setCor("#006400");
            setMensagem("A fruta " +  getInputFrutas() + " está disponivel para entrega");
        } else {
            System.out.println(getInputFrutas());
            setCor("#8B0000");
            setMensagem("A fruta " + getInputFrutas() + " não está disponível no momento...");
        }

    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getInputFrutas() {
        return inputFrutas;
    }

    public void setInputFrutas(String inputFrutas) {
        this.inputFrutas = inputFrutas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
