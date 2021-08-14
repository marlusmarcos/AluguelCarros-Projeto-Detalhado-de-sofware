package aluguelCarrosService;

import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IOnibusDAO;
import aluguelCarrosDAO.OnibusDAO;
import aluguelCarrosModels.Bicicleta;
import aluguelCarrosModels.Onibus;

public class OnibusService {
	protected IOnibusDAO onibusDAO = new OnibusDAO();
	public void inserirOnibus (Onibus onibus) throws ServicoException  {
		verificarBicicleta(onibus);
		onibusDAO.inserir(onibus);
	}
	public void remover (int id) {
		
	}
	public void alterar (int id, Onibus onibus) throws ServicoException {
		verificarBicicleta(onibus);
		if (onibusDAO.buscar(id) == null) {
			throw new ServicoException("Carro com id passado não existe!\n");
		} 
		this.onibusDAO.alterar(id, onibus);
	}
	public Onibus buscarOnibus(int id) {
		return onibusDAO.buscar(id);
	}
	public ArrayList<Onibus> buscarCarros () {
		return this.onibusDAO.buscarOnibus();
	}
	
	public int verificarBicicleta (Onibus c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Cliente nulo\n";
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
