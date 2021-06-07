package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class comparandoAreaDeDoisRetangulos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double area1 = 0;
		double base1 = 0;
		double altura1 = 0;
		double area2 = 0;
		double base2 = 0;
		double altura2 = 0;
		
		System.out.println("Insira a base do retângulo 1: ");
		base1 = leia.nextDouble();
		System.out.println("Insira a altura do retângulo 1: ");
		altura1 = leia.nextDouble();
		System.out.println("Insira a base do retângulo 2: ");
		base2 = leia.nextDouble();
		System.out.println("Insira a altura do retângulo 2: ");
		altura2 = leia.nextDouble();
		
		area1 = base1 * altura1;
		area2 = base2 * altura2;
		
		System.out.printf(" área do retângulo 1 = %f,",area1);
		System.out.printf(" área do retângulo 2 = %f",area2);
		System.out.println();
		
			if(area1 > area2) {
				System.out.println("A área do retângulo 1 é maior que ao do retângulo 2");
			}
			else {
				System.out.println("A área do retângulo 2 é maior que ao do retângulo 1");
			}
		
		
	}
}
