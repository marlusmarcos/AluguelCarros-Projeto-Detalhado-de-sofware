package aluguelCarrosService;

import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.CarroDAO;
import aluguelCarrosDAO.ICarroDAO;
import aluguelCarrosModels.Carro;

public class CarroService {
	protected ICarroDAO carroDAO = new CarroDAO();

	public void inserir (Carro carro) throws ServicoException  {
		verificarCarro(carro);
		carroDAO.inserir(carro);
	}
	public void remover (int id) {
		
	}
	public void alterar (int id, Carro carro) throws ServicoException {
		verificarCarro(carro);
		if (carroDAO.buscar(id) == null) {
			throw new ServicoException("Carro com id passado não existe!\n");
		} 
		this.carroDAO.alterar(id, carro);
	}
	public Carro buscarCarro (int id) {
		return carroDAO.buscar(id);
	}
	public ArrayList<Carro> buscarCarros () {
		return this.carroDAO.buscarCarros();
	}
	
	public int verificarCarro (Carro c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Cliente nulo\n";
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
