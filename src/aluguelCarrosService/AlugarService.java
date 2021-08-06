package aluguelCarrosService;

import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.AlugarDAO;
import aluguelCarrosDAO.CarroDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosDAO.ICarroDAO;
import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;

public class AlugarService {
	protected IAlugarDAO alugarDAO = new AlugarDAO();
	protected CarroService carroServ;
	protected ClienteService clienteService;
	
	public AlugarService(CarroService carroServ,ClienteService clienteService ) {
		super();
		this.carroServ = carroServ;
		this.clienteService = clienteService;
	}

	public void alugarCarro (int idcarro, int idcliente) throws ServicoException {
		Carro car = carroServ.buscarCarro(idcarro);
		Cliente cliente = clienteService.buscarID(idcliente);
		if (car != null && car.getStatus() == 1 && cliente != null && cliente.getTipo() == 1) {
			System.out.println("ENTREI NO IF */***********************************/*");
			car.setStatus(0);
			carroServ.alterar(idcarro, car);
		}
		System.out.println("Cliente ou Carro não existem/ ou é um locataio");
		
	}
	
	public void inserirAlugados (Alugar alugar)  {
		
		alugarDAO.inserir(alugar);
	}
	public void remover (int id) {
		
	}
	
	public Alugar buscarAlugados (int id) {
		return alugarDAO.buscar(id);
	}
	

}
