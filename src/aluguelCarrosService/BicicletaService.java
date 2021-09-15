package aluguelCarrosService;

import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.BicicletaDAO;
import aluguelCarrosDAO.IBicicletaDAO;
import aluguelCarrosDAO.ProdutoDAO;
import aluguelCarrosModels.Bicicleta;


public class BicicletaService implements ProdutoGerenciaStrategy{
	
	protected ProdutoDAO produtoDAO;

	public BicicletaService() {
		super();

	}
	
	@Override
	public void inserir(Produto produto, IProdutoDAO produtoDAO) throws ServicoException {
		verificarBicicleta((Bicicleta) produto);
		produtoDAO.inserir(produto);
		
	}
	
	@Override
	public void alterar(Produto produto) {
		// 
		
	}
	
	public int verificarBicicleta (Bicicleta b) throws ServicoException  {
		String erros = "";
		if (b == null) {
			erros += "Bicicleta nula! \n";
		}else {
			if (b.getDono() != 1 && b.getDono() != 2) {
				erros+="O dono deve ser 1 ou 2! \n";
			}
			if (b.getModelo() == "" || b.getModelo() == null) {
				erros += "O modelo está vazio!\n";
			}
			if (b.getCor() == "" || b.getCor() == null) {

				erros += "A cor está vazia!\n";
			}
			if (b.getPreco() < 0) {
				erros += "O preço inserido é inválido!\n";

				erros += "A cor está vazia! \n";
			}
			if (b.getPreco() < 0) {
				erros += "O preço inserido está inválido! \n";

			}
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}
	
	/*public int verificarBicicleta (Bicicleta c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Cliente nulo\n";
		}
		if (c.getDono() != 1 && c.getDono() != 2) {
			erros+="o dono deve ser 1 ou 2\n";
		}
		if (c.getModelo() == "") {
			erros += "o modelo estÃ¡ vazio\n";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}/*

}
