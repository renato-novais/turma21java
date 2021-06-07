/*
 * Um sistema de equações lineares do tipo:
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */

package lista1;

import java.util.Scanner;

public class list1exer7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.println("Insira um valor para o coeficiente a: ");
		int a = leia.nextInt();
		System.out.println("Insira um valor para o coeficiente b: ");
		int b = leia.nextInt();
		System.out.println("Insira um valor para o coeficiente c: ");
		int c = leia.nextInt();
		System.out.println("Insira um valor para o coeficiente d: ");
		int d = leia.nextInt();
		System.out.println("Insira um valor para o coeficiente e: ");
		int e = leia.nextInt();
		System.out.println("Insira um valor para o coeficiente f: ");
		int f = leia.nextInt();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.printf("O valor de X é %d e Y é %d",x,y);
		
		
	}

}
