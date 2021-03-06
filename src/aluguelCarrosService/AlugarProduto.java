
package aluguelCarrosService;

import java.util.ArrayList;

import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Alugar;

public class AlugarProduto {
	ProdutoService produtoService;
	//ProdutoServiceStrategy p;
	protected IAlugarDAO alugarContextDAO = new AlugarContextDAO();

	public AlugarProduto(ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}
	//função para verificar se é locador ou locatário
	

	public void alugarProduto(int idproduto, int idcliente, int qtdDias, ProdutoAlugarStrategy prodServStrategy, ClienteService clienteService) {		
		
			prodServStrategy.alugar(idproduto, idcliente, qtdDias, produtoService, clienteService, alugarContextDAO);
		
	}
	public Alugar buscar (int id) {
		return alugarContextDAO.buscar(id);
	}
	public void devolucao(int idProduto, int idCliente, ProdutoAlugarStrategy prodServStrategy, ClienteService clienteService, String avaliacao) {
		prodServStrategy.devolucao(idProduto, idCliente, produtoService, clienteService, alugarContextDAO, avaliacao);
		
	}
	public ArrayList<Alugar> todosAlugados () {
		return alugarContextDAO.buscarProdutos();
	}
	
	
		

}

