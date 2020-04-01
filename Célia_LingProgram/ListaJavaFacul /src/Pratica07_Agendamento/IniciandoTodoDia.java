package Pratica07_Agendamento;

import Entregavel_Exer01_Monitoramento.Start;
import Pratica02_MostrarMensagen.TelaMensagem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IniciandoTodoDia {
    static Timer timer = null;
    static String status_iniciacao_atividade = "false";

    static {
        try {
            timer = new Timer();
        } catch (Exception e) {
            System.out.println("Excecao: " + e);
        }
    }

    public static String checandoStatusTarefa() throws Exception {
        if (status_iniciacao_atividade.equals("true")) {
            System.out.println("Tarefa ja iniciada");
        } else {
            System.out.println("Tarefa nao iniciada");
            Calendar calendario = Calendar.getInstance();
            calendario.set(Calendar.HOUR_OF_DAY, 22);
            calendario.set(Calendar.MINUTE, 9);
            calendario.set(Calendar.SECOND, 00);
            Date dttime = calendario.getTime();
            System.out.println("Data/Hora da tarefa agendada: " + dttime);
            timer.schedule(new IniciandoTodoDia.iniciandoTodoDia(), dttime);

        }
        return null;
    }

    public static class iniciandoTodoDia extends TimerTask {
        @Override
        public void run() {
            System.out.println("---------------------------------------------------------------------------");
            status_iniciacao_atividade = "true";
            System.out.println("Tarefa iniciada.");

            String carimboDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            System.out.println("date da tarefa" + carimboDate);

            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Nome da atividade atual: " + name);

            try {
                LogicaMetodo();
            } catch (Exception ex) {
                Logger.getLogger(IniciandoTodoDia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String LogicaMetodo() {
        System.out.println("Funcionou?");
        return null;
    }

    public static void main(String[] args) throws Exception {
        IniciandoTodoDia.checandoStatusTarefa();
    }

}

