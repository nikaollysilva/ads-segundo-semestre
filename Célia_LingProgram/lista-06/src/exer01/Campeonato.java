package exer01;

//SEM JFRAME
 
import java.util.Random;

/**
 *
 * @author Nikaolly
 */
public class Campeonato {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        Clube Clube01 = new Clube();
        Clube Clube02 = new Clube();

        Clube01.setNome("Palmeiras");
        Clube02.setNome("Corinthians");

        System.out.println("Começa a temporada!");

        for (int i = 1; i <= 3; i++) {
            Integer vez = aleatorio.nextInt(3);
            
            System.out.println("________________________________________________"
                    + "\n Rodada: " + i);
            switch (vez) {
                case 0:
                    Clube01.vencer();
                    Clube02.perder();
                    break;
                case 1:
                    Clube01.perder();
                    Clube02.vencer();
                    break;
                case 2:
                    Clube01.empatar();
                    Clube02.empatar();
                    break;
            }
        }

        System.out.println("____________________________________"
                + "\n Placar final:");

        Clube01.gerarPlacar();
        Clube02.gerarPlacar();
    }
}
