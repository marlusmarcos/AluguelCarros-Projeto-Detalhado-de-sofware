package aluguelCarrosService;

import aluguelCarrosDAO.IAlugarDAO;

public interface ProdutoServiceStrategy {
	void alugar (int idProduto, int idCliente, int qtdDias,	ContextProdutoService produtoService, 
			 ClienteService clienteService, IAlugarDAO alugarContextDAO);
	void validar();
	
}
