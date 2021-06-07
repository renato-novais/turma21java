/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */
package lista1;

import java.util.Scanner;

public class lista1exer8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		final double percentagemDistribuidor = 0.28;
		final double impostos = 0.45;

		System.out.println("Quanto custa o carro novo?");
		double custoFabrica = leia.nextDouble();

		double custoConsumidor = (custoFabrica + (custoFabrica * percentagemDistribuidor) + (custoFabrica * impostos));

		System.out.printf("O custo do carro para o consumidor será de R$ %f", custoConsumidor);

	}

}
