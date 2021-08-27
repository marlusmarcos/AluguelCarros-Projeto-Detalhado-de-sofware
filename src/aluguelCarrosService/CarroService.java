package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.CarroDAO;
import aluguelCarrosDAO.ICarroDAO;
import aluguelCarrosDAO.IProdutoDAO;
import aluguelCarrosDAO.ProdutoDAO;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Produto;

public class CarroService implements ProdutoGerenciaStrategy{
	//protected ICarroDAO carroDAO = new CarroDAO();
	//protected IProdutoDAO produtoDAO;


	public CarroService() {
		super();

	}

	@Override
	public void inserir(Produto produto, IProdutoDAO produtoDAO) throws ServicoException {
		verificarCarro((Carro) produto);
		produtoDAO.inserir(produto);
		
		
	}
	
	
	@Override
	public void alterar(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	public int verificarCarro (Carro c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Carro nulo!\n";
		}
		if (c.getPlaca().length() != 7) {
			erros+="Numeracao placa errada!\n";
		}
		if (c.getDono() != 1 && c.getDono() != 2) {
			erros+="O dono deve ser 1 ou 2!\n";
		}
		if (c.getModelo() == "" || c.getModelo() == null) {
			erros += "O modelo está vazio!\n";
		}
		if (c.getCor() == "" || c.getCor() == null) {
			erros += "A cor está vazia!\n";
		}
		if (c.getPreco() < 0) {
			erros += "O preço inserido é inválido!\n";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}

	
}
