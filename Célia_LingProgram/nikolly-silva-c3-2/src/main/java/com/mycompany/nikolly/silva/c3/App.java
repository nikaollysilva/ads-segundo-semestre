package com.mycompany.nikolly.silva.c3;

/**
 *
 * @author Nikaolly
 */
public class App {
    public static void main(String[] args) {
        MedicoClinico medicoDiurno = new MedicoClinico(1112, "Eduardo Costa", 10, 100.00);
        MedicoClinico medicoNoturno = new MedicoClinico(1113, "Gustavo Lima", 15, 100.00);
        
        MedicoAnestesista anestesistaDiurno = new MedicoAnestesista(1014, "Henquique Juliano", 10, 200.00);
        MedicoAnestesista anestesistaNoturno = new MedicoAnestesista(1016, "Cezar Menotti", 10, 100.00);
        
        Hospital hospitalPublico = new Hospital("Vermelhinho");
        
        hospitalPublico.contrataMedico(medicoDiurno);
        hospitalPublico.contrataMedico(medicoNoturno);
        hospitalPublico.contrataMedico(anestesistaDiurno);
        hospitalPublico.contrataMedico(anestesistaNoturno);
        
        hospitalPublico.exibeClinicos();
        hospitalPublico.exibeAnestesistas();
        
        hospitalPublico.exibeFolhaDePagamento();
    }
}
