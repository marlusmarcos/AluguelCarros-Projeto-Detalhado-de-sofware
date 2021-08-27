package aluguelCarrosService;

import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.BicicletaDAO;
import aluguelCarrosDAO.IBicicletaDAO;
import aluguelCarrosModels.Bicicleta;


public class BicicletaService {
	protected IBicicletaDAO bicicletaDAO = new BicicletaDAO();
	public void inserirBicileta (Bicicleta bicicleta) throws ServicoException  {
		verificarBicicleta(bicicleta);
		bicicletaDAO.inserir(bicicleta);
	}
	public void remover (int id) {
		
	}
	public void alterar (int id, Bicicleta bicicleta) throws ServicoException {
		verificarBicicleta(bicicleta);
		if (bicicletaDAO.buscar(id) == null) {
			throw new ServicoException("Carro com id passado n√£o existe!\n");
		} 
		this.bicicletaDAO.alterar(id, bicicleta);
	}
	public Bicicleta buscarCarro (int id) {
		return bicicletaDAO.buscar(id);
	}
	public ArrayList<Bicicleta> buscarCarros () {
		return this.bicicletaDAO.buscarBicicletas();
	}
	
	public int verificarBicicleta (Bicicleta b) throws ServicoException {
		String erros = "";
		if (b == null) {
			erros += "Bicicleta nula!\n";
		}else {
			if (b.getDono() != 1 && b.getDono() != 2) {
				erros+="O dono deve ser 1 ou 2!\n";
			}
			if (b.getModelo() == "" || b.getModelo() == null) {
				erros += "O modelo est· vazio!\n";
			}
			if (b.getCor() == "" || b.getCor() == null) {
				erros += "A cor est· vazia!\n";
			}
			if (b.getPreco() < 0) {
				erros += "O preÁo inserido È inv·lido!\n";
			}
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}

}
