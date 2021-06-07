/*
 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
 * 
 *  %s - para String
	%d - para int
	%s - para char 
	%.2f - double
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class list2exer2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		if(numero3 >= numero2 && numero2 >= numero1) {
			System.out.printf("%d %d %d", numero1, numero2, numero3);
		} else if(numero2 >= numero3 && numero3 >= numero1) {
			System.out.printf("%d %d %d", numero1, numero3, numero2);
		} else if(numero1 >= numero2 && numero2 >= numero3) {
			System.out.printf("%d %d %d", numero3, numero2, numero1);
		} else if (numero1 >= numero3 && numero3 >= numero2) {
			System.out.printf("%d %d %d", numero2, numero3, numero1);
		} else if(numero3 >= numero1 && numero1 >= numero2) {
			System.out.printf("%d %d %d", numero2, numero1, numero3);
		} else {
			System.out.printf("%d %d %d", numero3, numero1, numero2);
		}
		
	}

}
