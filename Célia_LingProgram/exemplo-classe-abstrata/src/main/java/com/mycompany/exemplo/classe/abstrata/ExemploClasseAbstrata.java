/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.classe.abstrata;

/**
 *
 * @author Nikaolly
 */
public class ExemploClasseAbstrata {

    public static void main(String[] args) {
        Funcionario f = new Vendedor("00234212300", "Amaral", 20000.00, 0.1);
        Funcionario h = new Horista("099099878", "Horacio", 40, 100.0);
        
        System.out.println(f);
        System.out.println(h);
        
        Empresa bandtec = new Empresa("bandtec");
        bandtec.adicionaFuncionario(f);
        bandtec.adicionaFuncionario(h);
        
        bandtec.exibeTodos();
        bandtec.exibeVendedores();
        bandtec.exibeTotalSalario();
    }
}
