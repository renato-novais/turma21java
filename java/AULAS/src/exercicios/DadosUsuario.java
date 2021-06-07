package exercicios;

import java.util.Scanner;

public class DadosUsuario {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String nome;
		int anoNascimento = 0;
		final int anoAtual = 2021;
		char genero;
		int idade = 0;
		
		System.out.println("Digite seu nome:");
		nome = leia.next();
		System.out.println("Digite seu ano de nascimento:");
		anoNascimento = leia.nextInt();
		System.out.println("Digite seu gênero (M-masculino/F-feminino/O-outro):");
		genero = leia.next().charAt(0);
		
		idade = anoAtual - anoNascimento;
		
		// %s - para String
		// %d - para int
		// %s - para char 
		//%.2f - double
		
		//System.out.println("Seu nome é "+nome+" sua idade é "+idade+" e seu gênero é "+genero+".");
		System.out.printf("Seu nome é "+nome+" sua idade é "+idade+" e seu gênero é "+genero+".");
		
		
	}

}
