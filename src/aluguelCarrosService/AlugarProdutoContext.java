
package aluguelCarrosService;

import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Alugar;

public class AlugarProdutoContext {
	ContextProdutoService produtoService;
	protected IAlugarDAO alugarContextDAO = new AlugarContextDAO();

	public AlugarProdutoContext(ContextProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}

	public void alugarProduto(int idproduto, int idcliente, int qtdDias, ProdutoServiceStrategy prodServStrategy, ClienteService clienteService) {		
		prodServStrategy.alugar(idproduto, idcliente, qtdDias, produtoService, clienteService, alugarContextDAO);
	}
	public Alugar buscar (int id) {
		return alugarContextDAO.buscar(id);
	}
		

}

