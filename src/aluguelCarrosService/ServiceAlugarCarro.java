package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

public class ServiceAlugarCarro  implements ProdutoAlugarStrategy{
	AlugarContextDAO al = new AlugarContextDAO();
	@Override
	public void alugar(int idProduto, int idCliente, int qtdDias, ProdutoService produtoService,
		ClienteService clienteService, IAlugarDAO alugarContextDAO) {
		Produto produto = produtoService.buscar(idProduto);
		Cliente cliente = clienteService.buscarID(idCliente);
		float preco = produto.getPreco()*qtdDias;
		try {
			if (validar(cliente, produto)) {
				produto.setStatus(0);
				System.out.println("CARRO ALUGADO COM SUCESSO!\n>>>> cliente: " + cliente.getNome() + "\n>>>> Carro: " + produto.getModelo());
				alugarContextDAO.inserir(produto, cliente, preco);
			}
		} catch (ServicoException e) {
			
			e.printStackTrace();
		}
		
	
		
	}
	@Override
	public boolean validar (Cliente cliente, Produto carro) throws ServicoException {
		String erros = "";
		if (cliente.getCnh() < 'B' || cliente.getCnh() > 'E') {
			erros += "A CNH do cliente não tem autorização para alugar o carro\b";
		}	
		if (carro.getStatus() != 1) {
				erros += "o carro não está disponível para ser alugado";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return true;
		
		
	}
	@Override
	public void devolucao(int idProduto, int idCliente, ProdutoService produtoService,
			ClienteService clienteService, IAlugarDAO alugarContextDAO, String avaliacao) {
		Carro produto = (Carro) produtoService.buscar(idProduto);
		Cliente cliente = clienteService.buscarID(idCliente);
		produto.setStatus(1);
		produto.setComentario(idCliente, avaliacao);		
		
	}
	
	



}

