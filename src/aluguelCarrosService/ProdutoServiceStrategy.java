package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

public interface ProdutoServiceStrategy {
	void alugar (int idProduto, int idCliente, int qtdDias,	ContextProdutoService produtoService, 
			 ClienteService clienteService, IAlugarDAO alugarContextDAO);
	//void validar();
	boolean validar(Cliente cliente, Produto carro) throws ServicoException;
	
	
}
