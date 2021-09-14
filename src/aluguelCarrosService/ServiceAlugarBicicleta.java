/*
import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

package aluguelCarrosService;

public class ServiceAlugarBicicleta implements ProdutoServiceStrategy  {

	AlugarContextDAO al = new AlugarContextDAO();
	@Override
	public void alugar(int idProduto, int idCliente, int qtdDias, ContextProdutoService produtoService,
			ClienteService clienteService, IAlugarDAO alugarContextDAO) {
		Produto produto = produtoService.buscar(idProduto);
		Cliente cliente = clienteService.buscarID(idCliente);
		float preco = produto.getPreco()*qtdDias;
		//fazer validações
		alugarContextDAO.inserir(produto, cliente, preco);
		
	}
	public void validar () {};
}
*/