/*
 * 4) Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
 */

package lista1;

import java.util.Scanner;

public class list1exer4 {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num1 = 0.0;
		double num2 = 0.0;
		double num3 = 0.0;
		double expressaoD = 0.0;
		double expressaoR = 0.0;
		double expressaoS = 0.0;
		
		System.out.println("Digite o primeiro número (A): ");
		num1 = leia.nextDouble();
		System.out.println("Digite o segundo número (B): ");
		num2 = leia.nextDouble();
		System.out.println("Digite o terceiro número (C): ");
		num3 = leia.nextDouble();
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		//Para fazer potência: Math.pow(x, y);   onde x=base & y=potencia
		
		expressaoR = Math.pow(num1+num2,2);
		expressaoS = Math.pow(num2+num3,2);
		expressaoD = ((expressaoR+expressaoS)/2);
		
		System.out.println("Expressão R = (A + B)^2");
		System.out.println("Resultado: "+expressaoR);
		System.out.println("");
		System.out.println("Expressão S = (B + C)^2");
		System.out.println("Resultado: "+expressaoS);
		System.out.println("");
		System.out.println("Expressão D = (R + S) / 2");
		System.out.println("Resultado: "+expressaoD);
				
	}

}
