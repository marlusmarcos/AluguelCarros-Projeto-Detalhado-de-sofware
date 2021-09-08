package view;

import ServoceExceptioin.ServicoException;
import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Moto;
import aluguelCarrosModels.Produto;
import aluguelCarrosService.AlugarProduto;
import aluguelCarrosService.CarroService;
import aluguelCarrosService.ClienteService;
import aluguelCarrosService.ContextProdutoService;
import aluguelCarrosService.MotoService;
import aluguelCarrosService.ProdutoGerenciaStrategy;
import aluguelCarrosService.ProdutoServiceStrategy;
import aluguelCarrosService.ServiceAlugarCarro;

public class ViewCasos {

				ClienteService clienteDAO = new ClienteService();
				Cliente cliente = new Cliente ();
				
				//classe de serviço para gerenciamento de veículos
				ContextProdutoService produtoService = new ContextProdutoService();
				
				//classe para gerenciameto de um carro (ponto variável)
				ProdutoGerenciaStrategy pgEstrategy = new CarroService();
				ProdutoGerenciaStrategy pgEstrategyMoto = new MotoService();
				
				//classe responsável por aluguel de veículo
				AlugarProduto alugarService = new AlugarProduto(produtoService); 
				
				//classe resposável por alugar um carro/ variável.
				ProdutoServiceStrategy alugarCarro = new ServiceAlugarCarro();

				public void cadastraUmCarro() throws ServicoException {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("CRIANDO E ADICIONANDO DOIS VEÍCULOS DO TIPO CARRO\n->UNO E GOL");
					Produto carro = new Carro("uno", "kjh4561", "branco", 1,1,(float) 80.0);
					Produto carro2 = new Carro("GOL", "mxs4597", "preto", 1,1,(float) 80.0);
					produtoService.inserir(carro, pgEstrategy);
					produtoService.inserir(carro2, pgEstrategy);
					System.out.println("-----------------------------------------------------------------");
				}
				public void cadastraUmaMoto() throws ServicoException {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("CRIANDO E ADICIONANDO DOIS VEÍCULOS DO TIPO moto\n->UNO E GOL");
					Produto moto = new Moto("CB-500", "kjh4561", "azul", 1,1,(float) 80.0);
					Produto moto2 = new Moto("XRE", "mxs4597", "preto", 1,1,(float) 80.0);
					produtoService.inserir(moto, pgEstrategyMoto);
					produtoService.inserir(moto2, pgEstrategyMoto);
					System.out.println("-----------------------------------------------------------------");
				}
				public void buscarProduto( int id) {
					System.out.println("-------------------------------------------------------------------");
					System.out.println("PRODUTO COM ID " + id +": " + produtoService.buscar(id).getModelo());
					System.out.println("-------------------------------------------------------------------");
				}
				
				
				public void buscarTodos() {
					System.out.println("-------------------------------------------------------------------");
					System.out.println("Listando TODOS OS PRODUTOS: ");
					for (Produto p : produtoService.buscarTodos()) {
						if (p instanceof Carro ){
							System.out.println("classe: " + p.getModelo());
						}
					}
					System.out.println("-------------------------------------------------------------------");
				}
				public void buscarProdTodos() {
					System.out.println("-------------------------------------------------------------------");
					System.out.println("BUSCANDO OS PRODUTOS DISPONÍVEIS");
					for (Produto p : produtoService.buscarTodos()) {
						if (p.getStatus() == 1 && p instanceof Moto)
						System.out.println("MODELO/TIPO: " + p.getModelo());
					}
					System.out.println("-------------------------------------------------------------------");
				}
				
			public void cadastrarClientes() throws ServicoException {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Cadastrando cliente Marlus com categoria A");
				System.out.println("-------------------------------------------------------------------");
				cliente.setCpf("01825293466");
				cliente.setEmail("marlus@gmail.com");
				cliente.setNome("Marlus Marcos");
				cliente.setTipo(1);
				cliente.setCnh('A');
				Cliente cliente2 = new Cliente ();
				System.out.println("Cadastrando cliente Marlus Marcos Rodrigues com categoria B");
				cliente2.setCpf("01888093466");
				cliente2.setEmail("marlus@gmail.com");
				cliente2.setNome("Marlus Marcos Rodrigues");
				cliente2.setCnh('B');
				System.out.println("-------------------------------------------------------------------");
				Cliente cliente3 = new Cliente ();
				cliente3.setCpf("01634993466");
				cliente3.setEmail("marlus@xxffgmail.com");
				cliente3.setNome("nomsfse");
//				//cliente.setTipo(1);
				clienteDAO.insert(cliente);
				clienteDAO.insert(cliente2);
				clienteDAO.insert(cliente3);
			}
			
			public void alterarCliente() {
				Cliente c  = new Cliente();
				c = clienteDAO.buscarID(1);
				System.out.println("nome: " + c.getNome());
				System.out.println("id: " + c.getId());
			
				c = clienteDAO.buscarID(2);
				System.out.println("nome: " + c.getNome());
				System.out.println("id: " + c.getId());
			
				c = clienteDAO.buscarID(3);
				System.out.println("nome: " + c.getNome());
				System.out.println("id: " + c.getId());
			
			}
			public void alugarUmProduto() {
				System.out.println("=******* ALUGANDO UM CARRO COM CATEROGIA DIFERENTE *******=");
				alugarService.alugarProduto(1, 1, 2, alugarCarro, clienteDAO);
				System.out.println("=******* ALUGANDO UM CARRO COM CATEROGIA CORRETA *******=");
				alugarService.alugarProduto(1, 2, 2, alugarCarro, clienteDAO);
				System.out.println("=******* ALUGANDO UM CARRO QUE JÁ FOI ALUGADO *******=");
				alugarService.alugarProduto(1, 3, 2, alugarCarro, clienteDAO);
			}
			
			public void carrosAlugados() {
				System.out.println("MOSTRANDO CARROS ALUGADOS: ");
				Alugar alugar = alugarService.buscar(1);
				//if (alugar.getCliente().getNome() )
				System.out.println("Cliente: " + alugar.getCliente().getNome() + "\nCarro: " + alugar.getProduto().getModelo());
			}
			public void devolucao () {
				alugarService.devolucao(1, 2, alugarCarro, clienteDAO, "carrro ótimo");
			}
			
		
			public void carrosDisponiveis () {
				System.out.println("Carros disponiveis");
				
				/*for (Carro c : carroService.buscarCarros()) {
					if (c.getStatus() == 1) {
					System.out.println("modelo: " + c.getModelo());
					System.out.println("placa: " + c.getPlaca());
					System.out.println("status: " + c.getDono());
				
					}
				 */
				}
}
/*
			}
			public void alugarCarro(int idcarro, int idcliente, int dias) throws ServicoException {
				alugar.alugarCarro(idcarro, idcliente, dias);
				
			}
			public void carrosAlugados () {
				int i = 0;
				//Carro carro = new Carro();
				for (Alugar car : alugar.todosAlugados()) {
					System.out.println("Carro: " + car.getCarro().getModelo());
				}
			}
			public void carrosClienteAlugados () {
				//Carro c = new Carro();
				//Cliente cl = new Cliente ();
				System.out.println("-----------------------------");
				System.out.println("Carros alugados do cliente:");
				for (Alugar car : alugar.todosAlugados()) {
					System.out.println("Carro: " + car.getCarro().getModelo() + " | Cliente: "+ car.getCliente().getNome());
					System.out.println("-----------------------------");
				}
			}
			public void informar () {
				System.out.println("Informação dos clientes");
				for (Alugar car : alugar.todosAlugados()) {
					System.out.println("Carro: " + car.getCarro().getModelo() + " | Cliente: "+ car.getCliente().getNome()+ " | preco: "+ car.getPreco());
					System.out.println("-----------------------------");
				}
				
			}
			
			
}
			*/