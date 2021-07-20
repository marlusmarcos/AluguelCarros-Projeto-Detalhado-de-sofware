package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Cliente;

public class ClienteDAO implements IClienteDAO{
	protected ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	protected int setarId;// criar automaticamente id para controle
	
	@Override
	public boolean inserir(Cliente cliente) {
		cliente.setId(sequenciarId());
		clientes.add(cliente);		
		return true;
	}

	@Override
	public boolean remover(int id) {
		Cliente out = new Cliente();
		for (Cliente c : clientes) {
			if (id == c.getId()) {
				out = c;
				break;
			}
		}
		this.clientes.remove(out);
		return true;
	}

	@Override
	public int alterar(int id, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
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

	@Override
	public int sequenciarId() {
		// id atual será igual ao próximo id em sequencia
		int myId = this.setarId;
		this.setarId+=1;
		return myId;
	}

}
