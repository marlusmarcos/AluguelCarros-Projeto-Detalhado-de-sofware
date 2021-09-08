package aluguelCarrosService;

import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IProdutoDAO;
import aluguelCarrosDAO.ProdutoDAO;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Moto;
import aluguelCarrosModels.Produto;

public class MotoService implements ProdutoGerenciaStrategy{

	@Override
	public void inserir(Produto produto, IProdutoDAO produtoDAO) throws ServicoException {
		verificarMoto((Moto) produto);
		produtoDAO.inserir(produto);
	}

	@Override
	public void alterar(Produto produto) {
		//TODO
		
	}
	public int verificarMoto (Moto c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "MOTO está nula\n";
		}
		if (c.getPlaca().length() != 7) {
			erros+="numeracao placa errada\n";
		}
		if (c.getDono() != 1 && c.getDono() != 2) {
			erros+="o dono deve ser 1 ou 2\n";
		}
		if (c.getModelo() == "") {
			erros += "o modelo está vazio\n";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}
}