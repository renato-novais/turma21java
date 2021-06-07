package lista5;

public class Aviao {
	
	private int numeroAviao;
	private String fabricante;
	private String numeroModelo;
	private int assentos;
	
	
	public void exibirDadosAviao() {
		System.out.printf("\nCódigo: %d\nFabricante: %s\nNúmero do Modelo: %s\nAssentos: %d\n", numeroAviao, fabricante, numeroModelo, assentos);
	}
	
	public void decolar() {
		System.out.println("Decolando...");
	}
	
	public void pousar() {
		System.out.println("Pousando...");
	}

	public int getNumeroAviao() {
		return numeroAviao;
	}

	public void setNumeroAviao(int numeroAviao) {
		this.numeroAviao = numeroAviao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNumeroModelo() {
		return numeroModelo;
	}

	public void setNumeroModelo(String numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
}