package aluguelCarrosService;
import java.util.ArrayList;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.IClienteDAO;
import aluguelCarrosModels.Cliente;

public class ClienteService {
	protected IClienteDAO clienteDAO;
	

	public ClienteService(IClienteDAO clienteDAO) {
		super();
		this.clienteDAO = clienteDAO;
	}
	

	public boolean inserir (Cliente cliente) throws ServicoException {
		verificarCliente(cliente);
		if (this.clienteDAO.buscar(cliente.getId()) != null ) {
			throw new ServicoException("Cliente já existe");
		}
		return this.clienteDAO.inserir(cliente);
	}
	public boolean remover (int idcliente) throws ServicoException {
		if (this.clienteDAO.buscar(idcliente) == null ) {
			throw new ServicoException("Cliente não existe");
		}
		return this.clienteDAO.remover(idcliente);
	}
	
	public int alterar (int id, Cliente cliente) throws ServicoException {
		verificarCliente(cliente);
		if (this.clienteDAO.buscar(id) == null ) {
			throw new ServicoException("Cliente não existe");
		}
		return this.clienteDAO.alterar(id, cliente);
	}
	public Cliente buscar (int id) {
		return this.clienteDAO.buscar(id);
	}
	
	public ArrayList<Cliente> buscarClientes () {
		return this.clienteDAO.buscarClientes();
	}
	
	
	public int verificarCliente (Cliente c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Cliente nulo\n";
		}
		if (c.getNome() == null) {
			erros+="nome vazio\n";
		}
		if (c.getCpf().length() != 11) {
			erros+="cpf não tem 11 digitos!\n";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}
	

}
