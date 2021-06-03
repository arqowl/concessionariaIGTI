package entidades;

import java.util.*;

public abstract class Veiculo {
	//Atributos
	protected String modelo;
	protected String marca;
	protected Integer ano;
	protected Double valor;
	protected Vendedor vendedorResponsavel;
	protected Cliente clienteComprador;

	
	//Construtores
	
	
	//Métodos
	public void consultarVeiculo() {
		
	}
	
	//Getters and Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Vendedor getVendedorResponsavel() {
		return vendedorResponsavel;
	}
	public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}
	public Cliente getClienteComprador() {
		return clienteComprador;
	}
	public void setClienteComprador(Cliente clienteComprador) {
		this.clienteComprador = clienteComprador;
	}

}
