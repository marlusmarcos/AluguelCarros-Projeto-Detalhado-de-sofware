package view;

import ServoceExceptioin.ServicoException;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Moto;
import aluguelCarrosModels.Produto;
import aluguelCarrosService.CarroService;
import aluguelCarrosService.ClienteService;
import aluguelCarrosService.ContextProdutoService;
import aluguelCarrosService.ProdutoGerenciaStrategy;

public class ViewCasos {
	//IClien	teDAO clienteDAO = new ClienteDAO();
				ClienteService clienteDAO = new ClienteService();
				//CarroService carroService = new CarroService();
				//AlugarService alugar = new AlugarService (carroService, clienteDAO);
				//IAlugarProdService alugarProdService = new AlugarProdutoContext();
				Cliente cliente = new Cliente ();

				//ProdutoServiceStrategy produtoCarro = new ServiceAlugarCarro();
				ContextProdutoService produtoService = new ContextProdutoService();
				ProdutoGerenciaStrategy pgEstrategy = new CarroService();
				
				
				public void cadastraUmCarro() throws ServicoException {
					
					Produto carro = new Carro("uno", "kjh4561", "branco", 1,1,(float) 80.0);
					Produto carro2 = new Carro("GOL", "mxs4597", "preto", 1,1,(float) 80.0);
					produtoService.inserir(carro, pgEstrategy);
					
					
				}
				public void buscarProduto( int id) {
					System.out.println("aqui: " + produtoService.buscar(id));
				}
				
				
				
				
			
			public void cadastrarClientes() throws ServicoException {
				//alugarProdService.alugarProduto(idcarro, idcliente, qtdDias);
				cliente.setCpf("01825293466");
				cliente.setEmail("marlus@gmail.com");
				cliente.setNome("Marlus Marcos");
				cliente.setTipo(1);
				cliente.setCnh('a');
				Cliente cliente2 = new Cliente ();
				cliente2.setCpf("01888093466");
				cliente2.setEmail("marsadadadalus@gmail.com");
				cliente2.setNome("nohjhjkhme");
				//moto.setModelo("FAN");
				//moto.setId(1);
				//motoService.inserirMoto(moto);
			//	System.out.println(motoService.buscarMoto(1).getModelo());
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
			
			public void cadastrarCarro () throws ServicoException {
				Carro carro = new Carro("uno", "kjh4561", "branco", 1,1,(float) 80.0);
				//carroService.inserir(carro);
				Carro carro2 = new Carro("GOL", "mxs4597", "preto", 1,1,(float) 80.0);
				//carroService.inserir(carro2);
				//Carro out = carroService.buscarCarro(1);
				//System.out.println("id:" + out.getId() +"\nModelo: " + out.getModelo());
				//out.setModelo("CERATO");
				//carroService.alterar(1, out);
				Carro out2 = new Carro();
				//out2 = carroService.buscarCarro(1);
				System.out.println("id:" + out2.getId() +"\nModelo: " + out2.getModelo());
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