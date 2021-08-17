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
			throw new ServicoException("Carro com id passado não existe!\n");
		} 
		this.bicicletaDAO.alterar(id, bicicleta);
	}
	public Bicicleta buscarCarro (int id) {
		return bicicletaDAO.buscar(id);
	}
	public ArrayList<Bicicleta> buscarCarros () {
		return this.bicicletaDAO.buscarBicicletas();
	}
	
	public int verificarBicicleta (Bicicleta c) throws ServicoException {
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