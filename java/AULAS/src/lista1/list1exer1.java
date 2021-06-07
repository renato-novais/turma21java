/*
 *1) Faça um sistema que leia a idade de uma pessoa expressa em 
 *anos, meses e dias e mostre-a expressa apenas em dias.
 */

package lista1;

import java.util.Scanner;

public class list1exer1 {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		int anos = 0;
		int meses = 0;
		int dias = 0;
		int idadeDias = 0;
		int idadeMeses = 0;
		int idadeAnos = 0;
		
		System.out.println("Digite seu nome:");
		nome = leia.next();
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		idadeAnos =  idade * 1;
		idadeMeses =  idade * 12;
		idadeDias =  idade * 365;
				
		System.out.println(nome+", você possuí "+idadeAnos+" ano(s) ou "+idadeMeses+" mes(es) ou "+idadeDias+" dia(s).");
		
		
	}
	
	
}
