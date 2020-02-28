package Lista03;

import java.util.Random;

public class Exer08_Votacao {
    public static void main(String[] args) {
        System.out.println("Pesquisa SABOR FAVORITO!\n"
                + "Qual o seu sabor favorito de pizza? \n"
                + "       Sabores  | Código \n"
                + "     Mussarela  |    5   \n"
                + "     Calabresa  |   25   \n"
                + "Quatro Queijos  |   50   \n");

        Random aleatorio = new Random();
        Integer contador = 1;
        Integer M5 = 0;
        Integer C25 = 0;
        Integer Q50 = 0;

        while (contador <= 10) {
            Integer sorteado = aleatorio.nextInt(3);

            switch (sorteado) {
                case 0:
                    M5++;
                    break;
                case 1:
                    C25++;
                    break;
                case 2:
                    Q50++;
                    break;
            }

            contador++;
        }

        System.out.print("_________________________\n"
                + "   -----RESULTADO-----\n"
                + "O sabor favorito é ");
        if (M5 > C25 && M5 > Q50) {
            System.out.println("Mussarela");
        } else if (C25 > M5 && C25 > Q50) {
            System.out.println("Calabresa");
        } else {
            System.out.println("Quatro Queijos");
        }
        System.out.println("Mussarela: " + M5);
        System.out.println("Calabresa: " + C25);
        System.out.println("Quatro Queijos: " + Q50);
    }
}
