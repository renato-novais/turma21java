package classes;

public class Basico extends Estudante
{
	private int diaAniversario;
	private String nome;

	public Basico(String nome,int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.nome = nome;
		this.diaAniversario = diaAniversario;
	}

	public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}


	public void bonusAniversario(int dia)
	{
		if(dia == diaAniversario) 
		{
			super.adicionarNota(super.getPontos()*0.1);
		}
	}
	

}