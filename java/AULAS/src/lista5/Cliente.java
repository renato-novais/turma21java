/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package lista5;

public class Cliente {

	//atributos
	
	public int numeroCadastro;
	public String nome;
	public int idade;
	public char genero;
	public String cpf;
	
	public void exibirDadosCliente() {
		System.out.printf("\nDados: %d\nNome: %s\nCPF: %s\nIdade: %d\n", numeroCadastro, nome, idade, genero, cpf);
	}

	public int getNumeroCadastro() {
		return numeroCadastro;
	}

	public void setNumeroCadastro(int numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getGenero() {
		return genero;
	}

	public void setIdade(char genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}