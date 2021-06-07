/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package lista4;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class lista4exer3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //construtor	
		Locale.setDefault(Locale.US);
		
		int matriz[][] = new int[3][3];
		int soma = 0;
		int qtdMaiores10 = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				Random random = new Random();
				matriz[linha][coluna] = random.nextInt(100);
				String espaco = " ";
				if(matriz[linha][coluna] > 10) {
					qtdMaiores10++;
					espaco = "  ";
				}
				soma += matriz[linha][coluna];
				
				System.out.printf("%d%s", matriz[linha][coluna], espaco);
			}
			System.out.println();
		}
		
		System.out.printf("Quantidade números maiores que 10: %d\nSoma: %d", qtdMaiores10, soma);
		
	}

}
