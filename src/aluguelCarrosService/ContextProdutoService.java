package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.CarroDAO;
import aluguelCarrosDAO.ICarroDAO;
import aluguelCarrosDAO.IProdutoDAO;
import aluguelCarrosDAO.ProdutoDAO;
import aluguelCarrosModels.Produto;

public class ContextProdutoService {
	protected ICarroDAO carroDAO = new CarroDAO();
	//protected IProdutoDAO produtoDAO;
	
//	public ContextProdutoService(ProdutoGerenciaStrategy produtoGerencia) {
//		super();
//		this.produtoGerencia = produtoGerencia;
//	}
	protected IProdutoDAO produtoDAO = new ProdutoDAO();
	//ProdutoGerenciaStrategy produtoGerencia;
	

	public void inserir (Produto produto, ProdutoGerenciaStrategy produtoGerencia) throws ServicoException  {
		produtoGerencia.inserir(produto, this.produtoDAO);
		
	}
	public Produto buscar(int id) {
		return this.produtoDAO.buscar(id);
	}
	
}
