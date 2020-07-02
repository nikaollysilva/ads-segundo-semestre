package com.mycompany.exemplo.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikaolly
 */
public class Empresa {

    private String nome;
    private List<Funcionario> lista;

    public Empresa(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario f) {
        lista.add(f);
    }

    public void exibeTodos() {
        System.out.println("Lista dos funcionarios \n");
        lista.forEach((f) -> {
            System.out.println(f);
        });
    }

    public void exibeVendedores() {
        System.out.println("Lista dos vendedores \n");
        lista.forEach((f) -> {
            if (f instanceof Vendedor) {
                System.out.println(f);
            }
        });
    }

    public void exibeTotalSalario() {
        Double total = 0.0;
        for (Funcionario f : lista) {
            total += f.calcSalario();
        }
        System.out.println("Total de salario gasto: " + total + "\n");
    }
}
