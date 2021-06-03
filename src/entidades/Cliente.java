package entidades;

public class Cliente extends Pessoa{
	//Atributos
	protected String endereco;
	
	//Construtores
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	
	//Métodos
	
	//Getters and Setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
