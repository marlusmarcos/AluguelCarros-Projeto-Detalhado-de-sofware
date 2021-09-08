package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IProdutoDAO;
import aluguelCarrosModels.Produto;

public interface ProdutoGerenciaStrategy {
	void inserir (Produto produto, IProdutoDAO produtoDAO) throws ServicoException;
	void alterar (Produto produto);
	
}
