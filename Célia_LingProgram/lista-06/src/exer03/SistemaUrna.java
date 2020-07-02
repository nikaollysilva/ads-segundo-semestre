/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03;

import java.util.Random;

/**
 *
 * @author Nikaolly
 */
public class SistemaUrna {

    public static void main(String[] args) {

        Integer stop = 0;
        UrnaEletronica urnaEletronica = new UrnaEletronica();

        System.out.println("Começou a eleição:");
 
        do {
            Random aleRandom = new Random();
            stop = aleRandom.nextInt(11);

            switch (stop) {
                case 1:
                    urnaEletronica.votarCandidato01();
                    break;
                case 2:
                    urnaEletronica.votarCandidato02();
                    break;
                case 3:
                    urnaEletronica.votarCandidato01();
                    break;
                case 4:
                    urnaEletronica.votarCandidato02();
                    break;
                case 5:
                    urnaEletronica.votarCandidato01();
                    break;
                case 6:
                    urnaEletronica.votarCandidato02();
                    break;
                case 7:
                    urnaEletronica.votarCandidato01();
                    break;
                case 8:
                    urnaEletronica.votarCandidato02();
                    break;
                case 9:
                    urnaEletronica.votarCandidato01();
                    break;
                case 10:
                    urnaEletronica.votarCandidato02();
                    break;
                case 0:
                    if (urnaEletronica.getTotalVotos() <= 10) {
                        stop = aleRandom.nextInt(10)+1;
                    }else{
                        urnaEletronica.encerrarEleicao();
                    }
                    break;
            }
        } while (stop != 0);
    }
}
