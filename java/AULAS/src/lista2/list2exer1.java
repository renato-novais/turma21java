/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class list2exer1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
	
		int num1;
		int num2;
		int num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
			if((num1>num2) && (num1>num3)) {
				System.out.println("O primeiro número é o maior, sendo ele %d");
			}
			else if((num2>num1) && (num2>num3)) {
				System.out.println("O segundo número é o maior, sendo ele "+num2);
			}
			else if ((num3>num1) && (num3>num2)) {
				System.out.println("O terceiro número é o maior, sendo ele "+num3);
			}
			else {
				System.out.println("Os números inseridos são iguais");
			}
		
		
	}
}
