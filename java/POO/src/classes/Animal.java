package classes;

import interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal{                //classe abstrata = classe mae
	
	//Atributos - segurança(private)
	private String nome;
	private int idade;
	
	//construtores
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//encapsulamento - getters and setters
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
	
	//metodos	
	@Override
	public void movimentacao () {
		System.out.println("Correndo...");
	}
	
	
	
}
