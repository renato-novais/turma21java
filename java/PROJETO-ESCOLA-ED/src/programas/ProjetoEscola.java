package programas;

import java.util.Scanner;
import classes.Mestrado;

public class ProjetoEscola {

	public static void main (String[]args) {	
		
		Scanner leia = new Scanner (System.in);
		Scanner leiaS = new Scanner (System.in);
		Scanner leiaI = new Scanner (System.in);
		Mestrado mestre1 = new Mestrado(0,"");
		
		final String nomeEscola = "Generation";
		final String sloganEscola = "Formando sonhadores para n�o deixarem de sonhar";
		String tipoEnsino[] = {"BASICO","MEDIO","GRADUA��O","P�S","MESTRADO"};
		int opcaoDesejada;
		System.out.printf("Escola: %s\nSlogan: %s\n",nomeEscola,sloganEscola);
		System.out.print("\n1 - BASICO\n2 - M�DIO\n3 - GRADUA��O\n4 - P�S\n5 - MESTRADO\n\nDIGITE O NUMERO DO ENSINO QUE VOC� DESEJA: ");
		opcaoDesejada = leia.nextInt();
		opcaoDesejada -= 1;
		if(opcaoDesejada == 0 ) //ENSINO BASICO!!!
		{
			
		System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
			
		}
		
		if(opcaoDesejada == 1 ) //ENSINO MEDIO!!!
		{
			
		System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		
		
		}
		
		if(opcaoDesejada == 2 ) //ENSINO GRADUA��O!!!
		{
			
		System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		
		
		}
		
		if(opcaoDesejada == 3 ) //ENSINO P�S!!!
		{
			
		System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		
		
		}
		
		if(opcaoDesejada == 4 ) //ENSINO MESTRADO!!!
		{
			char opc =' ';
			double valor = 0.0;
			
			System.out.printf("\nEscola: %s\nSlogan: %s\n\nEnsino %s\n\n",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
			System.out.print("Matricula: ");
			mestre1.setMatricula(leiaI.nextInt());
			System.out.print("CPF: ");
			mestre1.setCpf(leiaS.nextLine());
			
			for(int i =0; i<10; i++) {
				
				System.out.printf("\nMOVIMENTO %d - [I] incluir nota ou [R] retirar nota:",i+1);
				opc = leiaS.next().toUpperCase().charAt(0);
				System.out.printf("Cr�dito atual: %.1f",mestre1.getCreditoMestrado());
				System.out.printf("\nTotal atual: %.1f ",mestre1.getCreditoMestrado()); 
				System.out.printf("\nValor movimento: ");
				valor = leiaI.nextDouble();
				System.out.printf("\nDeseja inserir cr�ditos?");
				
			    if(opc == 'I') mestre1.adicionarNota(valor);
			    else if (opc == 'R') mestre1.tirarNota(valor);	
					
			}
		}
		
	}
	
	
}
