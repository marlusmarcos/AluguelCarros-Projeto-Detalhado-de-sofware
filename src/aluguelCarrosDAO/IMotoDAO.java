package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Moto;


public interface IMotoDAO {
	void inserir (Moto moto);
	int remover (int id);
	int alterar (int id, Moto moto);
	Moto buscar (int id);
	ArrayList<Moto> buscarMotos();
	public int sequenciarId ();

}
