package Pratica10_CalculadoraObj;

public class Calculadora{

    private String a;
    private String b;
    private Double num1;
    private Double num2;
    private Double result;

    void somar(){
        num1 = Double.parseDouble(a);
        num2 = Double.parseDouble(b);
        result = num1 + num2;
    }
    void subtrair(){
        num1 = Double.parseDouble(a);
        num2 = Double.parseDouble(b);
        result = num1 - num2;
    }
    void dividir(){
        num1 = Double.parseDouble(a);
        num2 = Double.parseDouble(b);
        result = num1 / num2;
    }
    void multiplicar(){
        num1 = Double.parseDouble(a);
        num2 = Double.parseDouble(b);
        result = num1 * num2;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Double getResult() {
        return result;
    }

}
