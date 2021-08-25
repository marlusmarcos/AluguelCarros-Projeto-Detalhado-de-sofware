package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;


public interface IAlugarDAOStrategy {
	void inserir(Carro idcarro, Cliente idcliente, float preco);
	int alterar (int id, Alugar alugar);
	public int sequenciarId ();
	
	
	
	
}
