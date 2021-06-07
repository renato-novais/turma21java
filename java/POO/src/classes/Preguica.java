package classes;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom ()   {
		System.out.println("ZZzZZz");
	}
	@Override
	public void movimentacao() {
	System.out.println("Subindo em árvore");
	}
	
}
