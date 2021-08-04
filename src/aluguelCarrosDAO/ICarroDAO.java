package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Carro;

public interface ICarroDAO {
	void inserir (Carro carro);
	int remover (int id);
	int alterar (int id, Carro carro);
	Carro buscar (int id);
	ArrayList<Carro> buscarClientes();
	public int sequenciarId ();

}
