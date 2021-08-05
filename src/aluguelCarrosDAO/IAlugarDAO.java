package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;


public interface IAlugarDAO {
	void inserir (Alugar alugar);
	int remover (int id);
	int alterar (int id, Alugar alugar);
	Alugar buscar (int id);
	ArrayList<Alugar> buscarAlugados();
	public int sequenciarId ();
	
}
