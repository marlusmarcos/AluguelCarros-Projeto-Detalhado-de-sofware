package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

public interface ProdutoServiceStrategy {
	void alugar (int idProduto, int idCliente, int qtdDias,	ProdutoService produtoService, 
			 ClienteService clienteService, IAlugarDAO alugarContextDAO);
	boolean validar(Cliente cliente, Produto produto) throws ServicoException;
	public void devolucao(int idProduto, int idCliente, ProdutoService produtoService, ClienteService clienteService, IAlugarDAO alugarContextDAO, 
			String avaliacao);
	
	
}
