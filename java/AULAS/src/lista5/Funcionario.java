/*
 * 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
 */

package lista5;

public class Funcionario {

	private int numeroCarteira;
	private String nome;
	private String cpf;
	private double salario;
	
	public void exibirDadosFuncionario() {
		System.out.printf("\nCódigo: %d\nNome: %s\nCPF: %s\nSalario: %.2f\n", numeroCarteira, nome, cpf, salario);
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
