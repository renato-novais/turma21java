/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

package lista3;

import java.util.Locale;
import java.util.Scanner;

public class lista3exer3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int pessoasMenos21 = 0;
		int pessoasMais50 = 0;
		
		while(idade != -99) {
			System.out.println("Insira a idade ou digite -99 para encerrar: ");
			idade = leia.nextInt();
			
				if(idade<=21 && idade>0) {
					pessoasMenos21 += 1;
				}
				else if (idade>=50) {
					pessoasMais50 +=1;
				}
				else if (idade==0) {
					System.out.println("Idade inválida, é igual a zero");
					System.out.println();
				}
				else if(idade>21 && idade<50){
					System.out.println("Idade inválida, não corresponde as regras determinadas");
					System.out.println();
				}	
		}
		System.out.println("----------------------------------------");
		System.out.printf("Total de pessoas com menos de 21 anos: %d \n",pessoasMenos21);
		System.out.printf("Total de pessoas com mais de 50 anos: %d \n",pessoasMais50);
	}
}
