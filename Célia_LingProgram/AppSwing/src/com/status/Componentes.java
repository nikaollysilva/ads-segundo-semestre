package com.status;

import java.util.Random;

public class Componentes{
    Integer valor = 0;
    String cor = "#000";
    String status = "";

    Random aleatorio = new Random();

   public void atualizarDados(){
        valor = aleatorio.nextInt(101);
    }

    public void atualizarStatus(){
        if(valor < 20){
            status = "Suave";
            cor = "#6ab04c";
        } else if ( valor <= 70) {
            status = "Atenção";
            cor = "#f9ca24";
        } else {
            status = "Crítico!";
            cor = "#eb4d4b";
        }
    }
}
