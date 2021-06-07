/*
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */

package lista5;

public class Funcionario {

	private int numeroCarteira;
	private String nome;
	private String cpf;
	private double salario;
	
	public void exibirDadosFuncionario() {
		System.out.printf("\nC�digo: %d\nNome: %s\nCPF: %s\nSalario: %.2f\n", numeroCarteira, nome, cpf, salario);
	}

	public int getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
