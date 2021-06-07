/*
 * 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
menu de op��es:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
pr�pria matriz.
 */

package lista4;

import java.util.Random;
import java.util.Scanner;

public class lista4exer4 {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matrizSoma = new double[2][2];
		double[][] matrizSubtracao = new double[2][2];
		
		for(int linha = 0; linha < matriz1.length; linha++) {
			for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				Random random = new Random();
				matriz1[linha][coluna] = random.nextInt(9);
				matriz2[linha][coluna] = random.nextInt(9);
			}
		}
		
		char opcaoSaida = 'S';
		while(opcaoSaida != 'N') {
			System.out.println("(1) Somar\n(2) Subtrair\n(3) Adicionar valor\n(4) Imprimir");
			char opcaoMenu = sc.next().toUpperCase().charAt(0);
			
			if(opcaoMenu == '1') {
				System.out.println("==== MATRIZ SOMA ====");
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
						System.out.printf("%.0f ", matrizSoma[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println();
			} else if(opcaoMenu == '2') {
				System.out.println("==== MATRIZ SUBTRA��O ====");
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						matrizSubtracao[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
						System.out.printf("%.0f ", matrizSubtracao[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println();
			} else if(opcaoMenu == '3') {
				System.out.println("Qual valor deseja adicionar? ");
				double valor = sc.nextDouble();
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						matriz1[linha][coluna] += valor;
						matriz2[linha][coluna] += valor;
					}
				}
			}  else if(opcaoMenu == '4') {
				System.out.println("==== MATRIZ 1 ====");
				boolean imprimeMatriz1 = true;
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						if(imprimeMatriz1) {
							System.out.printf("%.0f ", matriz1[linha][coluna]);
						} else {
							System.out.printf("%.0f ", matriz2[linha][coluna]);
						}
					}
					System.out.println();
					if(linha == (matriz1.length - 1) && imprimeMatriz1) {
						linha = -1;
						System.out.println("\n==== MATRIZ 2 ====");
						imprimeMatriz1 = false;
					}
				}
				
				System.out.println();
			}
			
			
			System.out.print("Deseja continuar? [S - SIM | N - N�O] ");
			opcaoSaida = sc.next().toUpperCase().charAt(0);
			System.out.println();
		}
		
		sc.close();
	}
	
	
	public static void imprimirMatriz(double matriz[][]) {
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("%.1f ", matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
}