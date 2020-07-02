package com.mycompany.nikolly.santos.ultima.prova;

/**
 *
 * @author Nikaolly
 */
public class app {

    public static void main(String[] args) {

//      -----------------------  PREPARANDO OS LUTADORES DESSA NOITE -----------------------------------
        Heroi heroi1 = new Heroi("O cara que perde para uma pedrinha verde", "Clark Kent");
        Heroi heroi2 = new Heroi("Miranha", "Peter Park");
        Heroi heroi3 = new Heroi("Batmin", "Bruce Wayne");

        Vilao vilao1 = new Vilao("Mc Guimê", "Arthur Fleck?");
        Vilao vilao2 = new Vilao("Vilão muito forte", "Identidade desconhecida");
        Vilao vilao3 = new Vilao("Vilao rico", "Filho de papai");

        heroi1.adicionaPoder("Voar", 5);
        heroi1.adicionaPoder("Força", 10);
        heroi1.adicionaPoder("Visão de raio-x", 4);
        heroi1.adicionaPoder("Sopro Congelante", 3);

        heroi2.adicionaPoder("Soltar teia", 4);
        heroi2.adicionaPoder("Andar em paredes", 2);
        heroi2.adicionaPoder("Sentido aranha", 6);
        
        heroi3.adicionaPoder("Rico", 10);

        vilao1.adicionaPoder("Gás do riso", 8);

        vilao2.adicionaPoder("Poder iniqualavel", 100);
        
        vilao3.adicionaPoder("Rico", 11);
//      ------------------------------------------------------------------------------------------------

//      ------------------- PREPARANDO AS LUTAS --------------------------------------------------------    
        System.out.println("______________________________________________________________________\n"
                + "BOA NOITE SENHORAS E SENHORES!\n Em nosso combate de hoje temos convidados ilustres!  \n"
                + "(voz ecoa pelo salão)\n"
                + "______________________________________________________________________\n");

        Confronto.lutar(heroi1, vilao1);
        Confronto.lutar(heroi2, vilao2);
        Confronto.lutar(heroi3, vilao3);
    }
}
