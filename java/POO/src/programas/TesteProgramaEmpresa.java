package programas;

import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class TesteProgramaEmpresa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario funcionario2 = new Terceiro("X02P44","Jose Pereira",8,22, 30);
		
		System.out.println("DIGITE SEU NOME: ");
		String nome = leia.next();
		
		System.out.println("DIGITE SUA MATR�CULA: ");
		String matricula = leia.next();
		
		System.out.println("DIGITE AS HORAS TRABALHADAS: ");
		int hotasTrabalhadas = leia.nextInt();
		
		System.out.println("DIGITE O SUA REMUNERA��O POR HORA: ");
		double ganhoHora = leia.nextDouble();
		
		Funcionario funcionario = new Funcionario(matricula,nome,hotasTrabalhadas,ganhoHora);
		funcionario.salario();
		funcionario2.salario();
	}
      
}
