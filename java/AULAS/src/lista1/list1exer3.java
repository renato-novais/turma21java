/*
 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

package lista1;

import java.util.Scanner;

public class list1exer3 {

	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		System.out.println("Digite a dura��o do evento da f�brica em segundos: ");
		segundos = leia.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) % 60);
		
		System.out.println("A dura��o do evento foi "+horas+" hora(s), "+minutos+" minuto(s) e "+segundos+" segundo(s)");
				
	}
}
