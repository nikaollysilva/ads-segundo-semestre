package Lista05;

import java.util.Random;

public class Exer01_Dadinhos {
    Integer numeroSorteado, vitorias01 = 0, vitorias02 = 0;

    Random sortear = new Random();

    void jogarDado(){
        numeroSorteado = sortear.nextInt(6)+1;
    }
}
