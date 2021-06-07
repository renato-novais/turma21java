/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */

package lista1;

import java.util.Scanner;

public class list1exer2 {

	public static void main (String[] args) {
		
	Scanner leia = new Scanner(System.in);	
	
		String nome;
		int anos = 0;
		int meses = 0;
		int dias = 0;
	
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = (dias / 365);
		meses = ((dias % 365) / 30);
		dias = ((dias % 365) % 30);
		
		System.out.println(nome+", você possui "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dia(s)");

	}

}