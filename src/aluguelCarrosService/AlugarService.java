package aluguelCarrosService;

import java.util.ArrayList;

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
		inserirAlugados(idcarro, idcliente);
		
	}
	
	public void inserirAlugados (int idcarro, int idcliente)  {
		
		alugarDAO.inserir(idcarro, idcliente);
	}
	public void remover (int id) {
		
	}
	
	public Alugar buscarAlugados (int id) {
		return alugarDAO.buscar(id);
	}
	public ArrayList<Alugar> todosAlugados () {
		return this.alugarDAO.buscarAlugados();
	}

}
