/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejunit;

/**
 *
 * @author Nikaolly
 */
public class Numeros {
    
    public Boolean numeroPar(Integer n){
    return n%2 ==0;
    }
    
    public int areaQuadrado(Integer lado){
        return lado*lado;
    }
    
    public Boolean numeroDivisivel(Integer dividendo, Integer divisor){
    return  dividendo%divisor ==0;
    }
}
