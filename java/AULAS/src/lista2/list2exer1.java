/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
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
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
			if((num1>num2) && (num1>num3)) {
				System.out.println("O primeiro n�mero � o maior, sendo ele %d");
			}
			else if((num2>num1) && (num2>num3)) {
				System.out.println("O segundo n�mero � o maior, sendo ele "+num2);
			}
			else if ((num3>num1) && (num3>num2)) {
				System.out.println("O terceiro n�mero � o maior, sendo ele "+num3);
			}
			else {
				System.out.println("Os n�meros inseridos s�o iguais");
			}
		
		
	}
}
