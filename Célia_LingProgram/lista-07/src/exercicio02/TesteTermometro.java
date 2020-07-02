/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author Nikaolly
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro01 = new Termometro(30.0, 120.0, 0.0);
        
        termometro01.exibeFahreinheit();
        termometro01.aumentaTemperatura(22.0);
        termometro01.aumentaTemperatura(120.0);
        
        termometro01.gerarDados();
        termometro01.exibeFahreinheit();
        
        termometro01.diminuiTemperatura(30.0);
        termometro01.exibeFahreinheit();
        
        termometro01.diminuiTemperatura(120.0);
        termometro01.gerarDados();
        
        System.out.println("Fim da aplicação");
    }
}
