/*
 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
 */

package lista1;

import java.util.Scanner;

public class list1exer5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeAluno;
		int nota1 = 0; //x2
		int nota2 = 0;//x3
		int nota3 = 0;//x5 
		double mediaPonderada = 0.00;
		
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = leia.next();
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3= leia.nextInt();
		
		mediaPonderada = (((nota1*2) + (nota2*3) + (nota3*5))/(2+3+5));
		
		System.out.println("M�dia ponderada: "+mediaPonderada);
				
		
	}

}
