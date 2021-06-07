//Transformar Celsius para Fahrenheit

package exercicios;

import java.util.Scanner;

public class conversaoCelsiusFahrenheit {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double celsius = 0.00;
		double fahrenheit = 0.00;
		
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextDouble();
		
		fahrenheit = ((celsius * 1.8) + 32); // (0 °C × 9/5) + 32 = 32 °F
		
		//System.out.println("Temperatura Fahrenheit: "+fahrenheit+" °F");
		System.out.printf("Temperatura Fahrenheit: %.2f °F",fahrenheit);
	}

}
