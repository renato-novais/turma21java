package classes;

import java.util.Scanner;

public class Pos extends Estudante { 
	
	double credito = 0.00;
	
	public Pos (int matricula, String cpf, double pontos, boolean ativo) {
		super(matricula, cpf, pontos, ativo);
		credito = 5.00;
		
		
	}
	
	public void pedirCredito (double retira) {
		double dif = 0.00;
		if (super.getPontos()+credito >= retira) {
		dif = retira - super.getPontos();
		credito = credito - dif;
		super.adicionarNota(dif);
		super.tirarNota(retira);
		}
		
		
	}
	
	@Override
	public void tirarNota (double retira) {
		double valor = retira;
		Scanner leia = new Scanner(System.in);
		while(retira > (super.getPontos()+credito)) {
			System.out.println("Valor inválido, escreva um valor menor: ");
			retira = leia.nextDouble();
			
		}
		
		if(retira <= super.getPontos()) {
			super.tirarNota(retira);
		}
		
		else if(retira <= (super.getPontos()+ credito )) {
			pedirCredito(retira);
		}
		
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
		
}