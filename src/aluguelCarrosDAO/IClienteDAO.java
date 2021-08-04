package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Cliente;

public interface IClienteDAO {

	void inserir (Cliente cliente);
	int remover (int id);
	int alterar (int id, Cliente cliente);
	Cliente buscar (int id);
	ArrayList<Cliente> buscarClientes();
	public int sequenciarId ();
	
}
