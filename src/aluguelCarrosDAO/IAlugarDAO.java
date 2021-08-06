package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;


public interface IAlugarDAO {
	int remover (int id);
	int alterar (int id, Alugar alugar);
	Alugar buscar (int id);
	ArrayList<Alugar> buscarAlugados();
	public int sequenciarId ();
	void inserir(int idcliente, int idcarro);
	
}
