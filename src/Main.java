import ServoceExceptioin.ServicoException;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosService.CarroService;
import aluguelCarrosService.ClienteService;
//import aluguelCarrosService.IClienteService;

public class Main {
	
	public static void main (String [] args) throws ServicoException {
		//IClienteDAO clienteDAO = new ClienteDAO();
		ClienteService clienteDAO = new ClienteService();
		//		ClienteService cService = new ClienteService();
		Cliente cliente = new Cliente ();
		cliente.setCpf("01825293466");
		cliente.setEmail("marlus@gmail.com");
		cliente.setNome("asasas");
		
		Cliente cliente2 = new Cliente ();
		cliente2.setCpf("01888093466");
		cliente2.setEmail("marsadadadalus@gmail.com");
		cliente2.setNome("nohjhjkhme");
		
		Cliente cliente3 = new Cliente ();
		cliente3.setCpf("01634993466");
		cliente3.setEmail("marlus@xxffgmail.com");
		cliente3.setNome("nomsfse");
//		//cliente.setTipo(1);
		clienteDAO.insert(cliente);
		clienteDAO.insert(cliente2);
		clienteDAO.insert(cliente3);
		Cliente c  = new Cliente();
		c = clienteDAO.buscarID(1);
		System.out.println("nome: " + c.getNome());
		System.out.println("id: " + c.getId());
		
		c = clienteDAO.buscarID(2);
		System.out.println("nome: " + c.getNome());
		System.out.println("id: " + c.getId());
		
		c = clienteDAO.buscarID(3);
		System.out.println("nome: " + c.getNome());
		System.out.println("id: " + c.getId());
		
		CarroService carroService = new CarroService();
		Carro carro = new Carro("uno", "kjh4561", "branco", 1,1,(float) 80.0);
		carroService.inserirCarro(carro);
		Carro out = carroService.buscarCarro(1);
		System.out.println("id:" + out.getId() +"\nModelo: " + out.getModelo());
		out.setModelo("CERATO");
		carroService.alterar(1, out);
		Carro out2 = carroService.buscarCarro(1);
		System.out.println("id:" + out2.getId() +"\nModelo: " + out2.getModelo());
		
	}
	
}
