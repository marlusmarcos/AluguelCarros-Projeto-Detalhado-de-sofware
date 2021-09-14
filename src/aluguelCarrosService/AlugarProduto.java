
package aluguelCarrosService;

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
	public boolean permicaoAlugar(int idcliente, ClienteService clienteService) {
		if (clienteService.buscarID(idcliente).getTipo() == 2) {
			return true;
		}
		return false;
	}

	public void alugarProduto(int idproduto, int idcliente, int qtdDias, ProdutoAlugarStrategy prodServStrategy, ClienteService clienteService) {		
		if (permicaoAlugar(idcliente, clienteService)) {
			prodServStrategy.alugar(idproduto, idcliente, qtdDias, produtoService, clienteService, alugarContextDAO);
		} else {
			System.out.println("Não foi possível alugar, pois o cliente é um locador, e somente locatário pode alugar um produto.");
		}
	}
	public Alugar buscar (int id) {
		return alugarContextDAO.buscar(id);
	}
	public void devolucao(int idProduto, int idCliente, ProdutoAlugarStrategy prodServStrategy, ClienteService clienteService, String avaliacao) {
		prodServStrategy.devolucao(idProduto, idCliente, produtoService, clienteService, alugarContextDAO, avaliacao);
		
	}
	
		

}

