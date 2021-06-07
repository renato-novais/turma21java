package classes;

public class Estudante {

    //Atributos
    private int matricula;
    private String cpf;
    public String nome;
    private double pontos;

    //construtores/sobrecarga:
    public Estudante(int matricula, String cpf) {
        super();
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public Estudante(int matricula, String cpf, boolean status) {
        super();
        this.matricula = matricula;
        this.cpf = cpf;
    }
    	
    //getters and setters:

    public Estudante(int matricula, String cpf, double pontos, boolean status) {
        super();
        this.matricula = matricula;
        this.cpf = cpf;
        this.pontos = pontos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    //metodos 
    public void adicionarNota(double pontos) {
        this.pontos = this.pontos + pontos;
    }

    public void tirarNota(double pontos) {
        this.pontos = this.pontos - pontos;
    }

}