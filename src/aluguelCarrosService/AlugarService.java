package aluguelCarrosService;

import aluguelCarrosDAO.AlugarDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;

public class AlugarService {
	protected IAlugarDAO alugarDAO = new AlugarDAO();
	
	public void alugarCarro (Carro carro, Cliente Cliente) {
		
	}
	
	public void inserirAlugados (Alugar alugar)  {
		
		alugarDAO.inserir(alugar);
	}
	public void remover (int id) {
		
	}
	
	public Alugar buscarAlugados (int id) {
		return alugarDAO.buscar(id);
	}
	

}
