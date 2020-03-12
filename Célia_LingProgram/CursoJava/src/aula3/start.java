package aula3;

public class start {
    public static void main(String[] args){
        Caneta c1 = new Caneta("NIC", "Amarela",0.4f);
        c1.status();
        Caneta c2 = new Caneta("Brilhante", "Prata", 1.5f);
        c2.status();
        
//        System.out.println("Tenho uma caneta "+ c1.getModelo() + "de ponta " + c1.getPonta());
    }
}
