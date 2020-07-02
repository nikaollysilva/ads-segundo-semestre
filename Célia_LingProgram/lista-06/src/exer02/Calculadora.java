package exer02;
/**
 *
 * @author Nikaolly
 */
public class Calculadora {

    private String a;
    private String b;
    private Double num1;
    private Double num2;
    private Double result;

    public void somar() {
        setNum1(Double.parseDouble(getA()));
        setNum2(Double.parseDouble(getB()));
        setResult(getNum1() + getNum2());
    }

    public void Subtrair() {
        setNum1(Double.parseDouble(getA()));
        setNum2(Double.parseDouble(getB()));
        setResult(getNum1() - getNum2());
    }

    public void dividir() {
        setNum1(Double.parseDouble(getA()));
        setNum2(Double.parseDouble(getB()));
        setResult(getNum1() / getNum2());
    }

    public void multiplicar() {
        setNum1(Double.parseDouble(getA()));
        setNum2(Double.parseDouble(getB()));
        setResult(getNum1() * getNum2());
    }

//    GET E SET
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

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
