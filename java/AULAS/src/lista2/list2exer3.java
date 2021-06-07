/*
 * 3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
 	10-14 infantil
 	15-17 juvenil
	18-25 adulto
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class list2exer3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade;
	
		System.out.println("Escreva a idade da pessoa:");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria juvenil");
		} else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulto");
		} else {
			System.out.println("Idade n�o se enquadra em nenhuma categoria");
		}

	
	}

}
