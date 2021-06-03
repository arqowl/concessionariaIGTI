package entidades;

public class Carro extends Veiculo{
	//Atributos
	
	//Construtores
	public Carro() {
		
	}
	
	public Carro(String modelo, String marca, Integer ano, Double valor, Vendedor vendedorResponsavel, Cliente clienteComprador) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valor = valor;
		this.vendedorResponsavel = vendedorResponsavel;
		this.clienteComprador = clienteComprador;
	}
	
	//Métodos

	//Getters and Setters

}
