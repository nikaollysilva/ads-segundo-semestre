package Pratica01_TimerContador;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerContador {
    public static void main(String[] args) {
        int delay = 5000;   // tempo de espera antes da 1ª execução da tarefa.
        int interval = 1000;  // intervalo no qual a tarefa será executada.
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("Olá World!");
            }
        }, delay, interval);
    }

}
