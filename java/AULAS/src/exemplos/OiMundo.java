package exemplos;

import java.util.Scanner;

public class OiMundo {

	public static void main (String[] args) {
		
		//variaveis
		//inteiro numero1
		//cadeia nome
		//escreva(Digite o nome:"
		//leia(nome)
		//instancia = criar um teclado
		
		Scanner leia = new Scanner(System.in);
		
		String nome; //CADEIA
		int numero1 = 10; //INTEIRO
		int numero2 = 30;
		double salario = 1999.25; //DREAL
		char op = 'S'; //CARACTER
		
		System.out.println("Olá, mundo!");
		System.out.println("Digite o nome: ");
		nome = leia.next();
		//escreva("Digite um numero: ")
		System.out.println("Digite o numero 1: ");
		//leia(numero)
		numero1 = leia.nextInt();
		System.out.println("Digite o numero 2: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o salario: ");
		salario = leia.nextDouble();
		
		System.out.println("Nome: "+nome);
		System.out.println("Salario: "+salario);
		System.out.println(numero1+numero2);
				
	}	
}
