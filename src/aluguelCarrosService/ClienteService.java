package aluguelCarrosService;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.ClienteDAO;
import aluguelCarrosDAO.IClienteDAO;
import aluguelCarrosModels.Cliente;

public class ClienteService {
	protected IClienteDAO clienteDAO = new ClienteDAO();
	
	
/*	public ClienteService () {}
	public ClienteService(ClienteDAO clienteDAO) {
		super();
		this.clienteDAO = clienteDAO;
	}
	public static IClienteService getInstance() {
		if (instance == null) {
			instance = new ClienteService();
		}  
		return instance;
	}
	*/
	public int insert (Cliente cliente) throws ServicoException {
		
		verificarCliente(cliente);
		//System.out.println (cliente.getCpf()+cliente.getId());
		clienteDAO.inserir(cliente);
		return 1;
	}
	public int remover (int idcliente) throws ServicoException {
		if (this.clienteDAO.buscar(idcliente) == null ) {
			throw new ServicoException("Cliente n√£o existe");
		}
		return this.clienteDAO.remover(idcliente);
	}
	
	public int alterar (int id, Cliente cliente) throws ServicoException {
		verificarCliente(cliente);
		if (this.clienteDAO.buscar(id) == null ) {
			throw new ServicoException("Cliente n√£o existe");
		}
		return this.clienteDAO.alterar(id, cliente);
	}
	public Cliente buscarID (int id) {
		return this.clienteDAO.buscar(id);
	}
	
	public ArrayList<Cliente> buscarClientes () {
		return this.clienteDAO.buscarClientes();
	}
	
	
	public int verificarCliente (Cliente c) throws ServicoException {
		String erros = "";
		if (c == null) {
			erros += "Cliente nulo!\n";
		}
		if (c.getNome().length() < 1) {
			erros+="Nome vazio!\n";
		}
		if (c.getCpf().length() != 11) {
			erros+="CPF n„o tem 11 digitos!\n";
		}
		if (c.getCnh() == null || c.getCnh() == "") {
			erros+="CNH vazio!\n";
		}
		if(c.getEmail() != null && c.getEmail() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(c.getEmail());
			if(!matcher.matches()) {
				erros+="O e-mail n„o È v·lido!\n";
			}
		}else {
			erros+="O e-mail est· vazio!\n";
		}
		if (erros.length() > 0) {
			throw new ServicoException(erros);
		}
		return 1;
	}
	

}
