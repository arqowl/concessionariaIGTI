package entidades;

public class Vendedor extends Pessoa {
	//Atributos
	protected Integer matricula;


	
	//Construtores
	public Vendedor() {
	}

	public Vendedor(String nome, String cpf, Integer matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}


	
	//Métodos
	
	//Getters and Setters
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
}
