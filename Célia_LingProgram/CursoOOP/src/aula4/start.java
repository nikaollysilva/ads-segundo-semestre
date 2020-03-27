package aula4;

public class start {
    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");

        contaBanco p2 = new contaBanco();
        p2.setNumConta(1112);
        p2.setDono("Creusa");
        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(1000);
        p2.sacar(200);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
