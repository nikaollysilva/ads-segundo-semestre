package exercicio02;

//2. Crie uma classe chamada Termometro
//a) Crie os atributos temperaturaAtual, temperaturaMax, temperaturaMin
//b) Crie um método chamado aumentaTemperatura, que recebe um valor para
//aumentar a temperatura atual. Caso a nova temperatura seja maior do que a
//temperaturaMax, atribua para a temperatura atual a temperaturaMax. 
//c) Crie um método chamado diminuiTemperatura, que recebe um valor para
//diminuir a temperatura atual. Caso a nova temperatura seja menor do que a
//temperaturaMin, atribua para a temperatura atual a temperaturaMin. 
//d) Crie um método chamado exibeFahreinheit, que calcula e exibe a
//temperatura atual na escala de Fahreinheit. Pesquise como é a fórmula para
//converter de Celsius para Fahreinheit. 
//f) Crie uma outrea classe chamada TesteTermometro, crie uma instância e
//seus execute os métodos para testar sua classe recém criadapackage exercicio02;
/**
 *
 * @author Nikaolly
 */
public class Termometro {
    private Double temperaturaAtual;
    private Double temperaturaMax;
    private Double temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        
        gerarDados();
    }
    
    public void aumentaTemperatura(Double addATemp) {
        if ((temperaturaAtual + addATemp) > getTemperaturaMax()) {
            setTemperaturaAtual(getTemperaturaMax());
            System.out.println("Aumentando temperatura até o Máximo permitido.");

        } else {
            setTemperaturaAtual(getTemperaturaAtual() + addATemp);
            System.out.println(String.format("Aumentando temperatura atual em %.1fºC.\n "
                    + "Temperatura atual: %.1f", addATemp, getTemperaturaAtual()));

        }
    }

    public void diminuiTemperatura(Double dimATemp) {
        if ((temperaturaAtual - dimATemp) < getTemperaturaMin()) {
            setTemperaturaAtual(getTemperaturaMin());
            System.out.println("Diminuindo temperatura até o Minimo permitido.");
        } else {
            setTemperaturaAtual(getTemperaturaAtual() - dimATemp);
            System.out.println(String.format("Diminuindo temperatura atual em %.1fºC. \n"
                    + "Temperatura atual: %.1f", dimATemp, getTemperaturaAtual()));

        }
    }

    public void exibeFahreinheit() {
//        fórmula para conversao de Celsius em Fahreinheit
//        ( temp°C × 9/5) + 32 =  temp°F
        Double tempFahreinheit = ((getTemperaturaAtual() * 9) / 5) + 32;
        System.out.println(String.format("______________________________________\n"
                + "Temperatura em Celsius: %.1f ºC\n"
                + "Temperatura em Fahreinheit: %.1f ºF\n"
                + "______________________________________", getTemperaturaAtual(), tempFahreinheit));
    }

    public void gerarDados() {
        System.out.println(String.format("--------------------------------------\n"
                + "Temperatura Atual: %.1f ºC\n"
                + "Temperatura Máxima: %.1f ºC\n"
                + "Temperatura Mínima: %.1f ºC\n"
                + "--------------------------------------", getTemperaturaAtual(), getTemperaturaMax(), getTemperaturaMin()));
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

}
