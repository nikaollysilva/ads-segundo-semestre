package com.mycompany.nikolly.santos.ultima.prova;

/**
 *
 * @author Nikaolly
 */
public class Confronto {
    
    public static void lutar(Heroi heroi, Vilao vilao) {
        
        System.out.println(String.format("Luta: %s VS %s", heroi.getCodinome(), vilao.getCodinome()));
        
        if (heroi.getForcaTotal() > vilao.getForcaTotal()) {
            System.out.println(String.format("Hoje o dia foi dos mocinhos! \n"
                    + "Recebam o vencedor: %s !!", heroi.getCodinome()));
        } else if (heroi.getForcaTotal() < vilao.getForcaTotal()) {
            System.out.println(String.format("Hoje a Vilãnia venceu! \n"
                    + "Recebam o vencedor:  %s !!", vilao.getCodinome()));
        } else {
            System.out.println("A luta deu EMPATE!! E a balança do bem e do mal permanece sem alterações");
        }
        
        System.out.println("_____________________________________________________________________");
    }
    
}
