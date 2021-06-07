/*
 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */

package lista3;

public class lista3exer1 {

	public static void main(String[] args) {
		
		int qtdeNumeros = 0;
		
		for(int i = 1000; i<=1999; i++) {
			if(i % 11 == 5) {
				qtdeNumeros += 1;
			}
		}
		System.out.printf("Há %d números que possuem resto 5 ao dividir por 11.",qtdeNumeros);
			
	}
}
