package L5_Exer01_Dadinhos;

import java.util.Random;

public class Dadinho {
    Integer numeroSorteado, vitorias01 = 0, vitorias02 = 0;

    Random sortear = new Random();

    void jogarDado(){
        numeroSorteado = sortear.nextInt(6)+1;
    }
}
