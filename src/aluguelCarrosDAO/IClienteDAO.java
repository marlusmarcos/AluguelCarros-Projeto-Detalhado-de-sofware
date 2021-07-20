package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Cliente;

public interface IClienteDAO {

	boolean inserir (Cliente cliente);
	boolean remover (int id);
	int alterar (int id, Cliente cliente);
	Cliente buscar (int id);
	ArrayList<Cliente> buscarClientes();
	public int sequenciarId ();
	
}
