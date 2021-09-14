package view;

import ServoceExceptioin.ServicoException;
import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Moto;
import aluguelCarrosModels.Bicicleta;
import aluguelCarrosModels.Produto;
import aluguelCarrosService.AlugarProduto;
import aluguelCarrosService.CarroService;
import aluguelCarrosService.MotoService;
import aluguelCarrosService.BicicletaService;
import aluguelCarrosService.ClienteService;



import aluguelCarrosService.MotoService;
import aluguelCarrosService.ProdutoAlugarStrategy;

import aluguelCarrosService.ProdutoGerenciaStrategy;
import aluguelCarrosService.ProdutoService;
import aluguelCarrosService.ServiceAlugarCarro;
import aluguelCarrosService.ServiceAlugarMoto;
import aluguelCarrosService.ServiceAlugarBicicleta;

public class ViewCasos {

				ClienteService clienteDAO = new ClienteService();

				//classe de serviço para gerenciamento de veículos
				ProdutoService produtoService = new ProdutoService();

				
				//classe para gerenciameto de um carro (ponto variÃ¡vel)
				ProdutoGerenciaStrategy pgEstrategy = new CarroService();
				ProdutoGerenciaStrategy pgEstrategyMoto = new MotoService();
				ProdutoGerenciaStrategy pgEstrategyBicicleta = new BicicletaService();
				
				//classe responsavel pelo aluguel de veículo
				AlugarProduto alugarService = new AlugarProduto(produtoService); 
				

				//classe resposável por alugar um carro/ variável.
				ProdutoAlugarStrategy alugarCarro = new ServiceAlugarCarro();
				ProdutoAlugarStrategy alugarMoto = new ServiceAlugarMoto();
				ProdutoAlugarStrategy alugarBicicleta = new ServiceAlugarBicicleta();
				
				public void cadastraUmCarro() throws ServicoException {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("CRIANDO E ADICIONANDO DOIS VEÍCULOS DO TIPO CARRO \n->UNO E GOL");
					Produto carro = new Carro("uno", "kjh4561", "branco", 1,1,(float) 80.0);
					Produto carro2 = new Carro("GOL", "mxs4597", "preto", 1,1,(float) 80.0);
					produtoService.inserir(carro, pgEstrategy);
					produtoService.inserir(carro2, pgEstrategy);
					System.out.println("-----------------------------------------------------------------");
				}
				public void cadastraUmaMoto() throws ServicoException {
					System.out.println("-----------------------------------------------------------------");

					System.out.println("CRIANDO E ADICIONANDO DOIS VEÍCULOS DO TIPO moto\n- CB 500 E XRE");

					Produto moto = new Moto("CB-500", "kjh4561", "azul", 1,1,(float) 80.0);
					Produto moto2 = new Moto("XRE", "mxs4597", "preto", 1,1,(float) 80.0);
					produtoService.inserir(moto, pgEstrategyMoto);
					produtoService.inserir(moto2, pgEstrategyMoto);
					System.out.println("-----------------------------------------------------------------");
				}
				public void cadastraUmaBicicleta() throws ServicoException {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("CRIANDO E ADICIONANDO DOIS VEÍCULOS DO TIPO BICICLETA \n->MONARK E CALOI");
					Produto bicicleta = new Bicicleta("MONARK", "vermelha", 1, 1, (float) 8.50);
					Produto bicicleta2 = new Bicicleta("CALOI", "branca", 1, 1, (float) 11.0);
					produtoService.inserir(bicicleta, pgEstrategyBicicleta);
					produtoService.inserir(bicicleta2, pgEstrategyBicicleta);
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
					//	if (p instanceof Carro ){
							System.out.println("classe: " + p.getModelo());
						//}
					}
					System.out.println("-------------------------------------------------------------------");
				}
				public void buscarProdTodos() {
					System.out.println("-------------------------------------------------------------------");
					System.out.println("BUSCANDO AS MOTOS DISPONIVEIS");
					for (Produto p : produtoService.buscarTodos()) {
						if (p.getStatus() == 1 && p instanceof Moto)
						System.out.println("MODELO/TIPO: " + p.getModelo());
					}
					System.out.println("-------------------------------------------------------------------");
				}
				
			public void cadastrarClientes() throws ServicoException {
				//tipo -> 1 locador e 2 locatário
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Cadastrando cliente Marlus Marcos com categoria A");
				System.out.println("-------------------------------------------------------------------");
				Cliente cliente = new Cliente ();
				cliente.setCpf("01825293466");
				cliente.setEmail("marlus@gmail.com");
				cliente.setNome("Marlus Marcos");
				cliente.setTipo(2);
				cliente.setCnh('A');
				Cliente cliente2 = new Cliente ();
				System.out.println("Cadastrando cliente Rodrigues com categoria B");
				cliente2.setCpf("01888093466");
				cliente2.setEmail("marlus@gmail.com");
				cliente2.setNome("Rodrigues");
				cliente2.setCnh('B');
				cliente2.setTipo(2);
				System.out.println("-------------------------------------------------------------------");
				Cliente cliente3 = new Cliente ();
				cliente3.setCpf("01634993466");
				cliente3.setEmail("marlus@xxffgmail.com");
				cliente3.setNome("nome teste");
				cliente3.setTipo(2);
				cliente3.setCnh('D');
				clienteDAO.insert(cliente);
				clienteDAO.insert(cliente2);
				clienteDAO.insert(cliente3);
				
				Cliente cliente4 = new Cliente ();
				cliente4.setCpf("01825093455");
				cliente4.setNome("Neymar");
				cliente4.setIdade(17);
				clienteDAO.insert(cliente4);
			}
			public void listandoTodosClientes() {
				for (Cliente c: clienteDAO.buscarClientes()) {
					System.out.println("Cliente: " + c.getNome() + "\nCNH: " + c.getCnh());
				}
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
				/*produto, cliente e qtd de dias*/
				System.out.println("=******* ALUGANDO UM CARRO COM CATEROGIA DIFERENTE *******=");
				alugarService.alugarProduto(1, 1, 2, alugarCarro, clienteDAO);
				System.out.println("=******* ALUGANDO UM CARRO COM CATEROGIA CORRETA *******=");
				alugarService.alugarProduto(1, 2, 2, alugarCarro, clienteDAO);
				System.out.println("=******* ALUGANDO UM CARRO QUE JA FOI ALUGADO *******=");
				alugarService.alugarProduto(1, 3, 2, alugarCarro, clienteDAO);
			}
			public void alugarUmProdutoMoto() {
				System.out.println("=******* ALUGANDO UMA MOTO COM CATEROGIA DIFERENTE *******=");
				alugarService.alugarProduto(3, 2, 2, alugarMoto, clienteDAO);
				System.out.println("=******* ALUGANDO UMA MOTO COM CATEROGIA CORRETA *******=");
				alugarService.alugarProduto(3, 1, 2, alugarMoto, clienteDAO);
				System.out.println("=******* ALUGANDO UMA MOTO QUE JÁ FOI ALUGADA *******=");
				alugarService.alugarProduto(3, 2, 2, alugarMoto, clienteDAO);
			}
			public void alugarUmProdutoBicicleta() {
				System.out.println("=******* ALUGANDO UMA BICICLETA *******=");
				alugarService.alugarProduto(5, 4, 2, alugarBicicleta, clienteDAO);
				System.out.println("=******* ALUGANDO UMA BICICLETA QUE ESTÁ ALUGADA *******=");
				alugarService.alugarProduto(5, 3, 2, alugarBicicleta, clienteDAO);
			}
			
			public void carrosAlugados() {
				System.out.println("MOSTRANDO CARROS ALUGADOS: ");
				Alugar alugar = alugarService.buscar(1);
				//if (alugar.getCliente().getNome() )
				System.out.println("Cliente: " + alugar.getCliente().getNome() + "\n Carro: " + alugar.getProduto().getModelo());
			}
			public void MotosAlugados() {
				System.out.println("MOSTRANDO motos ALUGADAS: ");
				Alugar alugar = alugarService.buscar(1);
				//if (alugar.getCliente().getNome() )
				System.out.println("Cliente: " + alugar.getCliente().getNome() + "\n Moto: " + alugar.getProduto().getModelo());
			}
			public void BicicletasAlugadas() {
				System.out.println("MOSTRANDO AS BICICLETAS ALUGADAS: ");
				Alugar alugar = alugarService.buscar(1);
				//if (alugar.getCliente().getNome() )
				System.out.println("Cliente: " + alugar.getCliente().getNome() + "\n Bicicleta: " + alugar.getProduto().getModelo());
			}
			public void devolucao () {
				alugarService.devolucao(1, 2, alugarCarro, clienteDAO, "carrro otimo");
			}
			public void prodAlugadoPorCliente () {
				System.out.println("TODOS OS PRODUTOS ALUGADOS POR CLIENTES: \n");
				for (Alugar a: alugarService.todosAlugados()) {
					System.out.println("Cliente: "+a.getCliente().getNome() + "\nCPF:  " + a.getCliente().getCpf()+""
							+ "\n>>>>>> Produto: "+a.getProduto().getModelo()+"\n-------------------------------------------------------------------");
				}
			}
			
		
			
}
