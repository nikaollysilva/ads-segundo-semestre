package com.mycompany.nikolly.silva.c3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikaolly
 */
public class Hospital {

    private String nome;
    private List<Medico> medicos;

    public Hospital(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList();
    }

    public void contrataMedico(Medico medico) {
        medicos.add(medico);
    }

    public void exibeClinicos() {
        System.out.println("Procurando Medicos Clinicos...");
        if (medicos.isEmpty()) {
            System.out.println("Não existe Médicos Clinicos residentes.");
        } else {
            for (Medico medico : medicos) {
                if (medico instanceof MedicoClinico) {
                    System.out.println(medico + "\n");
                }
            }
        }
    }

    public void exibeAnestesistas() {
        System.out.println("Procurando Medicos Anestesistas...");
        if (medicos.isEmpty()) {
            System.out.println("Não existe Médico Anestesistas residentes");
        } else {
            for (Medico medico : medicos) {
                if (medico instanceof MedicoAnestesista) {
                    System.out.println(medico + "\n");
                }
            }
        }
    }

    public void exibeFolhaDePagamento() {
        Double valorTotalPagamentos = 0.0;

        for (Medico medico : medicos) {
            System.out.println(String.format(
                    "-----------------------------------------------\n"
                    + "               Folha de Pagamento             \n "
                    + "Nome: %s \n"
                    + "Salário: R$ %.2f \n"
                   +"-----------------------------------------------",
                    medico.getNome(), medico.calculaSalario()));

            valorTotalPagamentos += medico.calculaSalario();
        }

        System.out.println("Valor total para realizar pagamentos: R$ " + valorTotalPagamentos);
    }

    @Override
    public String toString() {
        return "Hospital{" + "nome=" + nome +'}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

}
