//c) Crie uma classe de teste chamada TesteEmpregado. Dentro do método
//main, instancie um objeto da classe Empregado que tenha como nome “João”, 
//salário inicial de R$ 5.400,00 e cargo “Analista de Sistemas”. 
//d) Imprima na tela o nome, o cargo e o salário reajustado, sabendo que este
//empregado recebeu um reajuste salarial de 15%. 
//e) Crie outro objeto da classe Empregado e forneça atributos de sua escolha.
//Depois imprima seus dados e também seu salário reajustado.package exercicio01;

package exercicio01;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado("João", "Analista de Sistemas", 5.400);
        empregado01.gerarDados();
        empregado01.reajustarSalario(0.15);
        empregado01.gerarDados();
        
        Empregado empregado02 = new Empregado("Nikolly", "Estagiaria", 2.000);
        empregado02.gerarDados();
        empregado02.reajustarSalario(0.10);
        empregado02.gerarDados();
        
        
        
    }
}
