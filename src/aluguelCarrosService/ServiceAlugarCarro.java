package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

public class ServiceAlugarCarro  implements ProdutoServiceStrategy{
	AlugarContextDAO al = new AlugarContextDAO();
	@Override
	public void alugar(int idProduto, int idCliente, int qtdDias, ContextProdutoService produtoService,
		ClienteService clienteService, IAlugarDAO alugarContextDAO) {
		Produto produto = produtoService.buscar(idProduto);
		Cliente cliente = clienteService.buscarID(idCliente);
		float preco = produto.getPreco()*qtdDias;
		//fazer validações
		try {
			if (validar(cliente, produto)) {
				alugarContextDAO.inserir(produto, cliente, preco);
				
			}
		} catch (ServicoException e) {
			
			e.printStackTrace();
		}
		
		alugarContextDAO.inserir(produto, cliente, preco);
		
	}
	@Override
	public boolean validar (Cliente cliente, Produto carro) throws ServicoException {
		String erros = "";
		if (cliente.getCnh() < 'B' || cliente.getCnh() > 'E') {
			erros += "A CNH do cliente não tem autorização para alugar o carro";
			if (erros.length() > 0) {
				throw new ServicoException(erros);
			}
			return false;
		}
		return true;
		
		
	}
	//@Override
	//public void validar() {
		// TODO Auto-generated method stub
		
	//}
	



}

