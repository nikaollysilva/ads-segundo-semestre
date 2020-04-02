package Pratica04_ContaCorrente;

public class ContaCorrente {

    //   "", Caracteristicas
    Double saldo = 0.0;
    String frase;
    Integer transacoes = 0;

    //    Metodos, funcoes
    void sacar() {
        if ((getSaldo()- 50) >= 0) {
            setSaldo(getSaldo() - 50);
            setFrase("Saque efetuado");
            transacoes++;
        } else {
            setFrase("Impossivel sacar, saldo insuficiente");
        }
    }

    void depositar() {
        setSaldo(getSaldo() + 50);
        setFrase("Deposito efetuado");
        setTransacoes(getTransacoes() + 1);
    }

    //  GET/SET
    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getTransacoes() {
        return this.transacoes;
    }

    public void setTransacoes(Integer transacoes) {
        this.transacoes = transacoes;
    }
}
