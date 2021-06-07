/*
 * 6) Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:
 */

package lista1;

import java.util.Scanner;

public class list1exer6 {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		double d = 0;
		
		System.out.println("Insira o valor x1");
		x1 = leia.nextDouble();
		System.out.println("Insira o valor x2");
		x2 = leia.nextDouble();
		System.out.println("Insira o valor y1");
		y1 = leia.nextDouble();
		System.out.println("Insira o valor y1");
		y2 = leia.nextDouble();
		 
		d = Math.sqrt((Math.pow(x2 - x1,2)) + (Math.pow(y2 - y1,2)));
		System.out.printf("d = %f",d);
	}

}
