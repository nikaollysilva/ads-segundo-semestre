package L3_Exer03_NumerosPares;

public class Exer03_NumerosPares {
    public static void main(String[] args) {
        Integer par = 0;
        while (par <= 40) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
            par++;
        }
    }
}
