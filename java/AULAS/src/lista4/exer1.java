package lista4;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		//A)
		int A[] = {1,0,5,-2,-5,-7};
		int soma = 0;
		//b) 
		soma += A[1] + A[1] + A[5];

		System.out.println(soma);
		
		//c)
		A[4] = 100;
		
		//d)
		for(int x = 0; x < A.length; x++) {
			System.out.println(A[x]+", ");
		}
					
				
	}
}
