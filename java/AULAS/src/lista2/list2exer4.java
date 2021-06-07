/*
 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class list2exer4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Escreva um número:");
		numero = leia.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.printf("O número %.0f é par e sua raiz quadrada é %.2f", numero, Math.sqrt(numero));
		} else {
			System.out.printf("O número %.0f é ímpar e elevado ao quadrado é %.0f", numero, Math.pow(numero, 2));
		}

	}

}
