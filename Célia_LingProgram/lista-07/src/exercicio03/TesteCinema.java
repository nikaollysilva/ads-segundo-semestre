/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author Nikaolly
 */
public class TesteCinema {
    public static void main(String[] args) {
        EntradaDeCinema ingresso01 = new EntradaDeCinema(12, 02, 10.00, "Vingadores");
        EntradaDeCinema ingresso02 = new EntradaDeCinema(12, 03, 10.00, "Vingadores");
        EntradaDeCinema ingresso03 = new EntradaDeCinema(23, 05, 10.00, "Pulp Fiction");
        
        ingresso01.calculaDesconto(18, true);
        ingresso01.gerarBilhete();
        
        ingresso02.calculaDesconto(12, true);
        ingresso02.gerarBilhete();
        
        ingresso03.calculaDesconto(35, false);
        ingresso03.gerarBilhete();
        
    }
}
