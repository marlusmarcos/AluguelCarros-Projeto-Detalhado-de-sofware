package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Bicicleta;

public interface IBicicletaDAO {
	void inserir (Bicicleta bicicleta);
	int remover (int id);
	int alterar (int id, Bicicleta bicicleta);
	Bicicleta buscar (int id);
	ArrayList<Bicicleta> buscarBicicletas();
	public int sequenciarId ();
}
