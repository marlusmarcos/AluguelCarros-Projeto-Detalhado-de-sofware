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
			throw new ServicoException("Carro com id passado não existe!\n");
		} 
		this.motoDAO.alterar(id, moto);
	}
	public Moto buscarMoto (int id) {
		return motoDAO.buscar(id);
	}
	public ArrayList<Moto> buscarMotos () {
		return this.motoDAO.buscarMotos();
	}
	
	public int verificarMoto (Moto c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Cliente nulo\n";
		}
/*		if (c.getPlaca().length() != 7) {
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
*/		//}
		return 1;
	}
}
