package entidades;

public class Moto extends Veiculo{
	//Atributos
	
	//Construtores
	public Moto(String modelo, String marca, Integer ano, Double valor, Vendedor vendedorResponsavel, Cliente clienteComprador) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valor = valor;
		this.vendedorResponsavel = vendedorResponsavel;
		this.clienteComprador = clienteComprador;
	}
	
	//Metodos
	
	//Getters and Setters

}
