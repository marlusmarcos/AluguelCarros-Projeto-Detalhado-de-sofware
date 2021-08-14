package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Onibus;

public interface IOnibusDAO {
	void inserir (Onibus onibus);
	int remover (int id);
	int alterar (int id, Onibus onibus);
	Onibus buscar (int id);
	ArrayList<Onibus> buscarOnibus();
	public int sequenciarId ();
		
}
