package exercicio01;

//Crie uma classe chamada Empregado
//a) Crie os atributos nome, cargo e salario. 
//b) Crie um método chamado reajustarSalario, que receberá como parâmetro a
//porcentagem do reajuste, e atualiza o atributo salario.... 
//c) Crie uma classe de teste chamada TesteEmpregado. Dentro do método
//main, instancie um objeto da classe Empregado que tenha como nome “João”, 
//salário inicial de R$ 5.400,00 e cargo “Analista de Sistemas”. 
//d) Imprima na tela o nome, o cargo e o salário reajustado, sabendo que este
//empregado recebeu um reajuste salarial de 15%. 
//e) Crie outro objeto da classe Empregado e forneça atributos de sua escolha.
//Depois imprima seus dados e também seu salário reajustado.package exercicio01;
/**
 *
 * @author Nikaolly
 */
public class Empregado {

    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void reajustarSalario(Double reajuste) {
        setSalario(getSalario() + (getSalario() * reajuste));
        System.out.println("Salário do(a) "+ getNome() +" reajustado");
    }

    public void gerarDados() {
        System.out.println(String.format("-----------------------------------------\n"
                + "Nome: " + getNome() + "\n"
                + "Cargo: " + getCargo() + "\n"
                + "Salário: R$%.3f,00 \n"
                + "-----------------------------------------", getSalario()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
