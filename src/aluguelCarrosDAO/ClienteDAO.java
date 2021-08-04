package aluguelCarrosDAO;

import java.util.ArrayList;
import java.util.List;

import aluguelCarrosModels.Cliente;

public class ClienteDAO implements IClienteDAO{
	protected ArrayList<Cliente> clientes;
	protected int setarId =0;// criar automaticamente id para controle
	
	public ClienteDAO() {
		this.clientes = new ArrayList<Cliente>();
		//this.setarId = 1;
	}	
	
	@Override
	public void inserir(Cliente cliente) {
		cliente.setId(sequenciarId());
		this.clientes.add(cliente);
		//return cliente.getId();
	}

	@Override
	public int remover(int id) {
		Cliente out = new Cliente();
		for (Cliente c : clientes) {
			if (id == c.getId()) {
				out = c;
				break;
			}
		}
		this.clientes.remove(out);
		return 1;
	}

	@Override
	public int alterar(int id, Cliente cliente) {
		for (Cliente cl : this.clientes) {
			if (cl.getId() == id) {
				cl.setId(id);
				cl.setNome(cliente.getNome());
				cl.setCpf(cliente.getCpf());
				cl.setEmail(cliente.getEmail());
				break;
			}
		}
		return id;
	}

	@Override
	public Cliente buscar(int id) {
		for (Cliente c : clientes) {
			if (id == c.getId()) {
				return c;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Cliente> buscarClientes() {
		return this.clientes;
	}
	public int setID () {
		this.setarId +=1;
		return this.setarId;
	}
	public int sequenciarId() {
		// id atual será igual ao próximo id em sequencia
		int id = setID();
		return id;
	}

	

}
