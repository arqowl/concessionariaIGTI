package entidades;

public abstract class Pessoa {
	// Atributos
	protected String nome;
	protected String cpf;
	//Construtores

	
	//M�todos
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
