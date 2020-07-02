package com.mycompany.heranca.aluno;

/**
 *
 * @author Nikaolly
 */
public class ProgramaAlunoHeranca {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(82, "Nikolly Santos", 9.0, 10.0);
        System.out.println(String.format("O aluno %s tem média %.2f", aluno1.getNome(), aluno1.calculaMedia()));
        System.out.println(aluno1);

        Aluno aluno2 = new Aluno(83, "Matheus Moreira", 4.0, 10.0);
        System.out.println(String.format("O aluno %s tem média %.2f", aluno2.getNome(), aluno2.calculaMedia()));
        System.out.println(aluno2);
        
        AlunosPos aluno3 = new AlunosPos(84, "Diego Nobre", 8.0, 8.0, 8.0);
        System.out.println(String.format("O aluno %s tem média %.2f", aluno3.getNome(), aluno3.calculaMedia()));
        System.err.println(aluno3);
        
    }
}
