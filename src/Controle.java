import java.lang.invoke.SwitchPoint;
import java.util.*;

import entidades.*;

public class Controle {
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Vendedor> vendedores = new ArrayList<>();
	ArrayList<Carro> carros = new ArrayList<>();
	ArrayList<Moto> motos = new ArrayList<>();
	
	Scanner entrada = new Scanner(System.in);
	

	
	public void iniciar() {
		boolean chave = true;
		
		Cliente clienteVazio = new Cliente("ninguém","","");
		Vendedor vendedorVazio = new Vendedor("ninguém","",0);
		
		while(chave) {
			imprimirMenu();
			int menu = entrada.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("******Você está consultando os Carros cadastrados******");
				if(!carros.equals(null))
					for(int i=0; i<carros.size();i++) {
						System.out.println("Índice: "+i+". A concessionária possui o carro "
								+carros.get(i).getModelo()+" de marca "
								+carros.get(i).getMarca()+" de ano "
								+carros.get(i).getAno()+" de valor R$"
								+carros.get(i).getValor()+" Vendido por "
								+carros.get(i).getVendedorResponsavel().getNome()+" para o cliente"
								+carros.get(i).getClienteComprador().getNome());
						
					} else{
						System.out.println("Não existe nenhum carro cadastrado");
					}
				break;
			case 2:
				System.out.println("******Você está consultando as Motos cadastrados******");
				if(!carros.equals(null))
					for(int i=0; i<motos.size();i++) {
						System.out.println("Índice: "+i+". A concessionária possui a moto "
								+motos.get(i).getModelo()+" de marca "
								+motos.get(i).getMarca()+" de ano "
								+motos.get(i).getAno()+" de valor R$"
								+motos.get(i).getValor()+" Vendido por "
								+motos.get(i).getVendedorResponsavel().getNome()+" para o cliente"
								+motos.get(i).getClienteComprador().getNome());
						
					} else {
						System.out.println("Não existe nenhuma moto cadastrada");
					}
				
				break;
			case 3:
				System.out.println("******Você está consultando os clientes cadastrados******");
				if(!clientes.equals(null))
					for(int i=0; i<clientes.size();i++) {
						System.out.println("Índice: "+i+". A concessionária possui o cliente "
								+clientes.get(i).getNome()+" de CPF "
								+clientes.get(i).getCpf()+" residente no endereço "
								+clientes.get(i).getEndereco());
						
					} else {
						System.out.println("Não existe nenhum cliente cadastrado");
					}
				break;
			case 4:
				System.out.println("******Você está consultando os vendedores cadastrados******");
				if(!clientes.equals(null))
					for(int i=0; i<vendedores.size();i++) {
						System.out.println("Índice: "+i+". A concessionária possui o Vendedor "
								+vendedores.get(i).getNome()+" de CPF "
								+vendedores.get(i).getCpf()+" residente no endereço "
								+vendedores.get(i).getMatricula());
						
					} else {
						System.out.println("Não existe nenhum vendedor cadastrado");
					}
				
				break;
			case 5:
				System.out.println("******Você está cadastrando um carro na concessionária******\n");
				System.out.println("Digite o Modelo do carro");
				String modeloCarro = entrada.next();
				System.out.println("Digite a Marca do carro");
				String marcaCarro = entrada.next();
				System.out.println("Digite o Ano do carro");
				Integer anoCarro = entrada.nextInt();
				System.out.println("Digite o Valor do carro");
				Double valorCarro = entrada.nextDouble();
				
				
				Carro carro = new Carro(modeloCarro, marcaCarro, anoCarro, valorCarro, vendedorVazio, clienteVazio);
				carros.add(carro);
				
				System.out.println("Carro cadastrado com sucesso");
				
				break;
			case 6:
				System.out.println("******Você está cadastrando uma moto na concessionária******");
				System.out.println("Digite o Modelo da moto");
				String modeloMoto = entrada.next();
				System.out.println("Digite a Marca da moto");
				String marcaMoto = entrada.next();
				System.out.println("Digite o Ano da moto");
				Integer anoMoto = entrada.nextInt();
				System.out.println("Digite o Valor da moto");
				Double valorMoto = entrada.nextDouble();
				
				Moto moto = new Moto(modeloMoto, marcaMoto, anoMoto, valorMoto, vendedorVazio, clienteVazio);
				motos.add(moto);
				
				System.out.println("Carro cadastrado com sucesso");
				
				break;
			case 7:
				System.out.println("******Você está cadastrando um cliente na concessionária******");
				System.out.println("Digite o nome do cliente");
				String nomeCliente = entrada.next();
				System.out.println("Digite o CPF do cliente");
				String cpfCliente = entrada.next();
				System.out.println("Digite o Endereço do cliente");
				String enderecoCliente = entrada.next();

				
				Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente);
				clientes.add(cliente);
				
				System.out.println("Cliente cadastrado com sucesso");
				
				break;
			case 8:
				System.out.println("******Você está cadastrando um Vendedor na concessionária******");
				System.out.println("Digite o nome do vendedor");
				String nomeVendedor = entrada.next();
				System.out.println("Digite o CPF do vendedor");
				String cpfVendedor = entrada.next();
				System.out.println("Digite o nº da matrícula do vendedor");
				Integer matriculaVendedor = entrada.nextInt();

				
				Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, matriculaVendedor);
				vendedores.add(vendedor);
				
				System.out.println("Vendedor cadastrado com sucesso");
				
				break;
			case 9:
				System.out.println("******Você está vendendo um Carro na concessionária******");
				System.out.println("Digite o índice do Carro que será vendido");
				Integer indiceCarro = entrada.nextInt();
				System.out.println("Digite o índice do Vendedor que vendeu o Carro");
				Integer indiceVendedorCarro = entrada.nextInt();
				System.out.println("Digite o índice do Vendedor que vendeu o Carro");
				Integer indiceClienteCarro = entrada.nextInt();
				
				carros.get(indiceCarro).setVendedorResponsavel(vendedores.get(indiceVendedorCarro));
				carros.get(indiceCarro).setClienteComprador(clientes.get(indiceClienteCarro));
				
				
				break;
			case 10:
				System.out.println("******Você está vendendo uma Moto na concessionária******");
				System.out.println("Digite o índice da Moto que será vendida");
				Integer indiceMoto = entrada.nextInt();
				System.out.println("Digite o índice do Vendedor que vendeu a Moto");
				Integer indiceVendedorMoto = entrada.nextInt();
				System.out.println("Digite o índice do Vendedor que vendeu a Moto");
				Integer indiceClienteMoto = entrada.nextInt();
				
				carros.get(indiceMoto).setVendedorResponsavel(vendedores.get(indiceVendedorMoto));
				carros.get(indiceMoto).setClienteComprador(clientes.get(indiceClienteMoto));

				break;

			default:
				chave = false;
				System.out.println("Você saiu do menu da concessionária");
				entrada.close();
				break;
			}
			
		}

		
	}
	
	public void imprimirMenu() {
		System.out.println("********Menu Concessionária********");
		System.out.println("Digite 1: Para consultar os carros");
		System.out.println("Digite 2: Para consultar as motos");
		System.out.println("Digite 3: Para consultar os clientes");
		System.out.println("Digite 4: Para consultar os vendedores");
		System.out.println("Digite 5: Para cadastrar um carro");
		System.out.println("Digite 6: Para cadastrar uma moto");
		System.out.println("Digite 7: Para cadastrar um cliente");
		System.out.println("Digite 8: Para cadastrar um vendedor");
		System.out.println("Digite 9: Para vender um carro");
		System.out.println("Digite qualquer outro número para sair\n");
	}

}
