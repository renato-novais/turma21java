/*
 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package lista3;

import java.util.Locale;
import java.util.Scanner;

public class lista3exer2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int qtdePar = 0;
		int qtdeImpar = 0;
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.printf("Digite o numero %d: ",i);
			numero = leia.nextInt();
				if(numero % 2 == 0) {
					qtdePar += 1;
				}
				else {
					qtdeImpar += 1;
				}
		}
		
		System.out.println();
		System.out.printf("Quantide de n�meros pares: %d \n",qtdePar);
		System.out.printf("Quantide de n�meros �mpares: %d \n",qtdeImpar);		
	}
}
