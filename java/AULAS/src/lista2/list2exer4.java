/*
 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class list2exer4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Escreva um n�mero:");
		numero = leia.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.printf("O n�mero %.0f � par e sua raiz quadrada � %.2f", numero, Math.sqrt(numero));
		} else {
			System.out.printf("O n�mero %.0f � �mpar e elevado ao quadrado � %.0f", numero, Math.pow(numero, 2));
		}

	}

}
