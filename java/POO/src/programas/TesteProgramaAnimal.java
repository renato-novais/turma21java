package programas;

import classes.Animal;
import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;

public class TesteProgramaAnimal {
	
	public static void main(String[] args) {
		
		Animal cavalo1 = new Cavalo("BalaNoAlvo",10);
		Animal cachorro1 = new Cachorro("Marley",4);
		Animal preguica1 = new Preguica("Sid",40);
		
		cavalo1.emitirSom();
		
		
		cachorro1.emitirSom();
		
		String nome = preguica1.getNome();
		preguica1.getIdade();
		preguica1.emitirSom();
		preguica1.movimentacao();
	}	
}
