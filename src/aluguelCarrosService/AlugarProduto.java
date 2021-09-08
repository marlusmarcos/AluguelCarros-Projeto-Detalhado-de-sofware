
package aluguelCarrosService;

import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;

public class AlugarProduto {
	ContextProdutoService produtoService;
	//ProdutoServiceStrategy p;
	protected IAlugarDAO alugarContextDAO = new AlugarContextDAO();

	public AlugarProduto(ContextProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}

	public void alugarProduto(int idproduto, int idcliente, int qtdDias, ProdutoServiceStrategy prodServStrategy, ClienteService clienteService) {		
		prodServStrategy.alugar(idproduto, idcliente, qtdDias, produtoService, clienteService, alugarContextDAO);
	}
	public Alugar buscar (int id) {
		return alugarContextDAO.buscar(id);
	}
	public void devolucao(int idProduto, int idCliente, ProdutoServiceStrategy prodServStrategy, ClienteService clienteService, String avaliacao) {
		prodServStrategy.devolucao(idProduto, idCliente, produtoService, clienteService, alugarContextDAO, avaliacao);
		
	}
	
		

}

