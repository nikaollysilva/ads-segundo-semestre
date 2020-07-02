package L3_Exer05_VariacaoContador;

public class Exer05_VariacaoContador {
    public static void main(String[] args) {
        for(double i = 0.15; i < 5; i += 0.15){
            System.out.printf("\n%.2f",i);
//          System.out.println(String.format("%.2f",i));
        }
    }
}
