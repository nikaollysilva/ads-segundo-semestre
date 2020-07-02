package com.mycompany.nikolly.santos.c3;

/**
 *
 * @author Nikaolly
 */
public class App {

    public static void main(String[] args) {
//      Prólogo do Sistema
        System.out.println("Carregando sistema...");
        System.out.println("Obtendo informações...");

//       ------- VETERINÁRIOS CLÍNICOS ---------
        VeterinarioClinico veterinarioClinicoEmConta = new VeterinarioClinico(32456, "Sebastiao Domingos", 1, 80.00);
        System.out.println("Abrindo folha de pagamento...\n" + veterinarioClinicoEmConta);

        VeterinarioClinico veterinarioClinicoCarinho = new VeterinarioClinico(65421, "Diego Salles", 2, 300.00);
        System.out.println("Abrindo folha de pagamento...\n" + veterinarioClinicoCarinho);

//      -------- VETERINÀRIOS CIRURGIAO ----------         
        VeterinarioCirurgiao veterinarioCirurgiaoEmConta = new VeterinarioCirurgiao(76536, "Alana Moreira", 1, 20.00, 1, 80.00);
        System.out.println("Abrindo folha de pagamento...\n" + veterinarioCirurgiaoEmConta);

        VeterinarioCirurgiao veterinarioCirurgiaoCarinho = new VeterinarioCirurgiao(76536, "Larissa Monteiro", 2, 200.00, 1, 800.00);
        System.out.println("Abrindo folha de pagamento...\n" + veterinarioCirurgiaoCarinho);

        System.out.println("Folhas de pagamentos abertas com sucesso...");
    }
}
