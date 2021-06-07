/*
 * 2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
 */

package lista4;

import java.util.Locale;
import java.util.Scanner;

public class lista4exer2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //construtor	
		Locale.setDefault(Locale.US);
		
		int[] numeros = new int[6];
		int[] impares = new int[numeros.length];
		int[] pares = new int[numeros.length];
	
		int somaPares = 0;
		int qtdImpares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print((i+1)+ "º número: ");
			numeros[i] = leia.nextInt();
			
			if(numeros[i] % 2 == 0 && numeros[i] != 0) {
				somaPares += numeros[i];
				pares[i] = numeros[i];
			} else {
				qtdImpares++;
				impares[i] = numeros[i];
			}
		}
		
		System.out.print("Pares: ");
		for(int i : pares) {
			if(i != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		System.out.printf("Soma dos pares: %d\n", somaPares);
		System.out.print("Ímpares: ");
		for (int i : impares) {
			if(i != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		System.out.printf("Quantidade de ímpares digitados: %d", qtdImpares);
		
		leia.close();

	}

}
