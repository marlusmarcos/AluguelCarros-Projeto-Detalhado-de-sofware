package aluguelCarrosService;

import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IMotoDAO;
import aluguelCarrosDAO.MotoDAO;
import aluguelCarrosModels.Moto;

public class MotoService {
	protected IMotoDAO motoDAO = new MotoDAO();
	
	public void inserirMoto (Moto moto) throws ServicoException  {
		//verificarMoto(moto);
		motoDAO.inserir(moto);
	}
	public void remover (int id) {
		
	}
	public void alterar (int id, Moto moto) throws ServicoException {
		verificarMoto(moto);
		if (motoDAO.buscar(id) == null) {
			throw new ServicoException("Carro com id passado nÃ£o existe!\n");
		} 
		this.motoDAO.alterar(id, moto);
	}
	public Moto buscarMoto (int id) {
		return motoDAO.buscar(id);
	}
	public ArrayList<Moto> buscarMotos () {
		return this.motoDAO.buscarMotos();
	}
	
	public int verificarMoto (Moto m) throws ServicoException {
		String erros = "";
		if (m == null) {
			erros += "Moto nula!\n";
		}
		if (m.getPlaca().length() != 7) {
			erros+="Numeração da placa está errada!\n";
		}
		if (m.getDono() != 1 && m.getDono() != 2) {
			erros+="O dono deve ser 1 ou 2!\n";
		}
		if (m.getModelo() == "" || m.getModelo() == null) {
			erros += "O modelo está vazio!\n";
		}
		if (m.getCor() == "" || m.getCor() == null) {
			erros += "A cor está vazia!\n";
		}
		if (m.getPreco() < 0) {
			erros += "O preço inserido é inválido!\n";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}
}
