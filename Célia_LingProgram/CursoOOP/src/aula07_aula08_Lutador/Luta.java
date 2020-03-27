package aula07_aula08_Lutador;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada=true;
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.aprovada = false;
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.aprovada) {

            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===== RESULTADO ======");
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do qq " + this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    //    get
    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public int getRounds() {
        return this.rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }


    //    set
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
