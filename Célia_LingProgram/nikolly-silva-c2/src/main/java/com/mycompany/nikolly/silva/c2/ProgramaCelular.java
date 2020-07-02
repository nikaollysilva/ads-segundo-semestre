package com.mycompany.nikolly.silva.c2;

/**
 *
 * @author Nikaolly
 */
public class ProgramaCelular {

    public static void main(String[] args) {

//     ------------------------Loja de aplicativos--------------------------
        App app01 = new App("FlappyBird ", "Jogos e entreterimento    ", 1.0);
        App app02 = new App("WhatsApp   ", "Rede sociais e Comunicação", 2.0);
        App app03 = new App("Telegran   ", "Rede sociais e Comunicação", 1.5);
        App app04 = new App("Facebook   ", "Rede sociais e Comunicação", 3.0);
        App app05 = new App("Piano Tales", "Jogos e entreterimento    ", 2.0);
        App app06 = new App("Google Maps", "Busca e Localização       ", 2.0);
        App app07 = new App("Seu Banco  ", "Utilitário                ", 2.0);
        App app08 = new App("Sudoku     ", "Jogos e entreterimento    ", 2.0);
//     ---------------------------------------------------------------------

//     ------------------------Meus celulares-------------------------------
        Celular celular01 = new Celular("IphoneX", 15.0);
        Celular celular02 = new Celular("Sansung", 5.0);
//     ---------------------------------------------------------------------
        celular01.exibeArmazenamentoDisponivel();

//      app01.exibeDados();
        celular01.instalarApp(app01);
        celular01.instalarApp(app02);
        celular01.instalarApp(app03);
        celular01.instalarApp(app04);
        celular01.instalarApp(app05);
        celular01.exibeAppsInstalados();

        celular01.instalarApp(app06);
        celular01.instalarApp(app07);
        celular01.exibeArmazenamentoDisponivel();

        celular01.instalarApp(app06);

        celular01.exibeAppsInstalados();
        
//        TESTES
        System.out.println("________________Testando_______________________________________________________");
        celular02.instalarApp(app08);
        celular02.exibeAppsInstalados();
        celular02.exibeArmazenamentoDisponivel();
        
        app08.exibeDados();
        
        celular02.instalarApp(app01);
//        Deve dar erro
        celular02.instalarApp(app04);
    }

}
