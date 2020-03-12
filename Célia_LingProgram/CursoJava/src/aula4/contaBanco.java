package aula4;

public class contaBanco {
    public int numConta;
    //inteiro
    protected String tipo;
    //caractere
    private String dono;
    //caractere
    private float saldo;
    //real
    private boolean status;
    //logico


    public void estadoAtual(){
        System.out.println("￿---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

// métodos personalizados

    //metodo construtor
    public contaBanco() {
        this.saldo = 0;
        this.status = false;

        // or this.setSaldo(0);
        // this.setStatus(false);
    }

    // metodos get

    //NUMEROCONTA GET/SET
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    //TIPO GET/SET
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    //DONO GET/SET
    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    //SALDO GET/SET
    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    //STATUS GET/SET
    public void setStatus(boolean st) {
        this.status = st;
    }

    public boolean getStatus() {
        return this.status;
    }


    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);


        if (t == "cc") {
//            saldo = 50;
              this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
//            saldo = 150;
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else {
            if (this.getSaldo() < 0) {
                System.out.println("Impossível fechar a conta. Conta em débito");
            } else {
                System.out.println("Impossível fechar a conta. Conta com dinheiro");
            }
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
//             or saldo = saldo + v
        } else {
            System.out.println("Impossivel depositar, conta inexistente");
        }
    }


    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque ");
            }
        } else {
            System.out.println("Impossivel sacar. Conta inexistente");
        }
    }


    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp") {
            v = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else{
                System.out.println("Mensalidade: Saldo insuficiente");
            }
        }else{
            System.out.println("Mensalidade: Conta inexistente");
        }

    }


}
