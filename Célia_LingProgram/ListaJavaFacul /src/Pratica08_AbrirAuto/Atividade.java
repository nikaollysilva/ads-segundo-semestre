package Pratica08_AbrirAuto;

import Entregavel_Exer01_Monitoramento.Start;
import Entregavel_Exer01_Monitoramento.TelaMonitoramento;
import Pratica02_MostrarMensagen.TelaMensagem;
import Pratica07_Agendamento.IniciandoTodoDia;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade extends TelaMensagem {

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
            calendario.set(Calendar.MINUTE, 51);
            calendario.set(Calendar.SECOND, 00);
            Date dttime = calendario.getTime();
            System.out.println("Data/Hora da tarefa agendada: " + dttime);
            timer.schedule(new Atividade.iniciandoTodoDia(), dttime);

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
//                ==== Ver o que significa essa linha ======
                Logger.getLogger(Atividade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String LogicaMetodo() {
        System.out.println("Funcionou?");
        StartMensagem();

//       ======= Dois pontos observados ===========
//       Para que chamar outros metodos aqui funcione:
//       1º)Faca o extends no metodo construtor, assim vc pode chamar e executar;
//       2º)Talvez as classes que serao executadas aqui n podem ter seu proprio metodo main.
        return null;
    }

    public static void main(String[] args) throws Exception {
        Atividade.checandoStatusTarefa();
    }


}
