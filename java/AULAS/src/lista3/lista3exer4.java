/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o número de pessoas calmas;
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos.
 */
package lista3;

import java.util.Locale;
import java.util.Scanner;

public class lista3exer4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //construtor	
		Locale.setDefault(Locale.US);
		
		int idade = 0;
		int sexo;
		int caracteristica;
		int qtdPessoas = 3;
		int contador = 0;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40 = 0;
		int pessoasCalmasMenos18 = 0;
		
		while(contador <= qtdPessoas){
		
			System.out.println("Qual é sua idade?");
			idade = leia.nextInt();
			
			System.out.println("Qual é seu sexo? 1-feminino/2-masculino/3-outros");
			sexo = leia.nextInt();
			
			System.out.println("Qual é sua característica? 1-Calme/2-Nervose/3-Agressive");
			caracteristica = leia.nextInt();
			
			if(caracteristica==1) {
				pessoasCalmas++;
			}
			
			if(caracteristica==2 && sexo==1) {
				mulheresNervosas++;
			}
			
			if(caracteristica==3 && sexo==2) {
				homensAgressivos++;
			}
			
			if(caracteristica==1 && sexo==3) {
				outrosCalmos++;
			}
			
			if(caracteristica==2 && idade>40) {
				pessoasNervosasMais40++;
			}
			
			if(caracteristica==1 && idade<18) {
				pessoasCalmasMenos18++;
			}
			contador += 1;
			
			System.out.println("Pessoas calmas: " + pessoasCalmas);
			System.out.println("Mulheres nervosas: " + mulheresNervosas);
			System.out.println("Homens agressivos: " + homensAgressivos);
			System.out.println("Outros calmos: " + outrosCalmos);
			System.out.println("Pessoas nervosas com mais de 40 anos: " + pessoasNervosasMais40);
			System.out.println("Pessoas calmas com menos de 18 anos: " + pessoasCalmasMenos18);
			
		}
		
	}
}
