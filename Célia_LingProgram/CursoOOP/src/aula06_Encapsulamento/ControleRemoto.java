package aula06_Encapsulamento;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

//    Metodos especiais

    //    Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //     Metodos Set
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //    Metodos Get
    private int getVolume() {
        return this.volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }


    //    Metodos ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------MENU------");
        System.out.println("Está ligado?" + this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.print(("Volume:" + this.getVolume()));

        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisvolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
            this.setTocando(true);
        }else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void ligarMudo() {
        if ( this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            this.setTocando(false);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
