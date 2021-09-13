package aluguelCarrosService;


//import aluguelCarrosDAO.AlugarContextDAO;
import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;

//package aluguelCarrosService;

public class ServiceAlugarMoto implements ProdutoServiceStrategy{

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
				System.out.println("MOTO ALUGADA COM SUCESSO!\n>>>> cliente: " + cliente.getNome() + "\n>>>> Moto: " + produto.getModelo());
				alugarContextDAO.inserir(produto, cliente, preco);
			}
		} catch (ServicoException e) {
			
			e.printStackTrace();
		}
		
	}
	public void validar () {}
	@Override
	public boolean validar(Cliente cliente, Produto moto) throws ServicoException {
		String erros = "";
		if (cliente.getCnh() < 'B' || cliente.getCnh() > 'E') {
			erros += "A CNH do cliente não tem autorização para alugar o carro\b";
		}	
		if (moto.getStatus() != 1) {
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
		// TODO Auto-generated method stub
		
	};
}
