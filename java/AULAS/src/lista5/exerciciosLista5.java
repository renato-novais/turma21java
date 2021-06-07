package lista5;

import lista5.Cliente;
import lista5.Aviao;
import lista5.Funcionario;

public class exerciciosLista5 {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNumeroCadastro(1);
		cliente.setNome("Rodrigo Torres");
		cliente.setCpf("382.239.293-23");
		cliente.setIdade(55);
		System.out.println("\nClasse: Cliente");
		cliente.exibirDadosCliente();
		
		Aviao aviao = new Aviao();
		aviao.setNumeroAviao(1);
		aviao.setFabricante("DEASER");
		aviao.setNumeroModelo("777-31H");
		aviao.setAssentos(186);
		System.out.println("\nClasse: Avião");
		aviao.exibirDadosAviao();
		aviao.decolar();
		aviao.pousar();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNumeroCarteira(1);
		funcionario.setNome("Milton Silva");
		funcionario.setCpf("283-234-234-33");
		funcionario.setSalario(4500);
		System.out.println("\nClasse: funcionario");
		funcionario.exibirDadosFuncionario();
	}
	

}
