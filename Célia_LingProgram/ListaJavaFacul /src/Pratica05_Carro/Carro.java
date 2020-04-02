package Pratica05_Carro;

public class Carro {

    private boolean ligado = false;
    private Double velocidade = 0.0;
    private Double gasolina = 30.0;
    private Integer contador = 1;
    private String mensagem = "";
    private String corMensagem = "#000000";
    private String status = "";
    private String corStatus = "#000000";
    public String statusGasolina = "";
    private String corGasolina = "#8B0000";


    public Carro() {
        setStatus("Desligado");
        setColorStatus("#8B0000");
        setMensagem("Ligue o carro");
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getGasolina() {
        return gasolina;
    }

    public void setGasolina(Double gasolina) {
        this.gasolina = gasolina;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getColorMensagem() {
        return corMensagem;
    }

    public void setColorMensagem(String corMensagem) {
        this.corMensagem = corMensagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusGasolina() {
        return statusGasolina;
    }

    public void setStatusGasolina(String statusGasolina) {
        this.statusGasolina = statusGasolina;
    }
    public String getColorGasolina() {
        return corGasolina;
    }

    public void setColorGasolina(String colorGasolina) {
        this.corGasolina = colorGasolina;
    }

    public String getColorStatus() {
        return corStatus;
    }

    public void setColorStatus(String corStatus) {
        this.corStatus = corStatus;
    }

    void acelerar() {
        if (getLigado()) {

            if ((getVelocidade() + 10) <= 120) {
                setVelocidade(getVelocidade() + 10);
                setMensagem("Velocidade Aumentada");
                setColorMensagem("#FF7F50");
            }
            if (contador == 4 && (getGasolina()- 2) >= 0 ) {
                setGasolina(getGasolina() - 2);
                contador = 0;
            }
            contador += 1;
        } else {
            setColorMensagem("#DC143C");
            setMensagem("Ligue seu carro para Acelerar");
        }

        if(getGasolina() > 0) {
            if (getGasolina() >= 20) {
                setStatusGasolina("Nivel Cheio");
                setColorGasolina("#006400");
            } else if (getGasolina() >= 12) {
                setStatusGasolina("Nivel Medio");
                setColorGasolina("#FF7F50");
            } else {
                setStatusGasolina("Nivel Baixo");
                setColorGasolina("#DC143C");
            }
        }else{
            setStatusGasolina("Acabou");
            setColorGasolina("#DC143C");
            desligar();
        }
    }

    void frear() {
        if (getLigado()) {
            if ((getVelocidade() - 10) >= 0) {
                setVelocidade(getVelocidade() - 10);
                if (getVelocidade() == 0) {
                    setMensagem("O carro está parado");
                    setColorMensagem("#000000");
                } else {
                    setMensagem("Velocidade Diminuida");
                    setColorMensagem("#FF7F50");
                }
            }
        }
    }

    void ligar() {
        if (getLigado()) {
            setMensagem("O carro já está Ligado");
            setColorMensagem("#006400");
        } else {
            setLigado(true);
            setStatus("Ligado");
            setColorStatus("#006400");
            setMensagem("O carro está ligado");
            setColorMensagem("#006400");
        }
    }

    void desligar() {
        if (!getLigado()) {
            setMensagem("O carro já está Desligado");
            setColorMensagem("#DC143C");
        } else {
            if (getVelocidade() > 0) {
                while ((getVelocidade() - 10) >= 0) {
                    setVelocidade(getVelocidade() - 10);
                }
                desligar();
            } else {
                setLigado(false);
                setStatus("Desligado");
                setColorStatus("#8B0000");
                setMensagem("Desligando... O carro está desligado");
                setColorMensagem("#DC143C");
            }
            if(getGasolina() <= 0){
                setMensagem("Desligando... Nao é possivel usar sem gasolina");
                setColorMensagem("#DC143C");
            }
        }
    }

    void abastecer(){
        setGasolina(30.0);
    }

}
