package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Bicicleta;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

public class ServiceAlugarBicicleta   implements ProdutoAlugarStrategy{
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
				System.out.println("BICICLETA ALUGADA COM SUCESSO!\n>>>> cliente: " + cliente.getNome() + "\n>>>> Bicicleta: " + produto.getModelo());
				alugarContextDAO.inserir(produto, cliente, preco);
			}
		} catch (ServicoException e) {
			
			e.printStackTrace();
		}
		
	
		
	}
	@Override
	public boolean validar (Cliente cliente, Produto bicicleta) throws ServicoException {
		String erros = "";
		
		if (bicicleta.getStatus() != 1) {
				erros += "A bicicleta não está disponível para ser alugada! \n";
		}
		if (cliente.getCnh() < 'A' || (cliente.getCnh() < 'E')) {
			if (cliente.getIdade() < 18) {
				erros+= "O cliente deve ter pelo menos 18 anos";
			}
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return true;
		
		
	}
	@Override
	public void devolucao(int idProduto, int idCliente, ProdutoService produtoService,
			ClienteService clienteService, IAlugarDAO alugarContextDAO, String avaliacao) {
		Bicicleta produto = (Bicicleta) produtoService.buscar(idProduto);
		Cliente cliente = clienteService.buscarID(idCliente);
		produto.setStatus(1);
		produto.setComentario(idCliente, avaliacao);		
		
	}
	
	



}