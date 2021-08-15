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

public class AlugarService implements IAlugarProdService {
	protected IAlugarDAO alugarDAO = new AlugarDAO();
	protected CarroService carroServ;
	protected ClienteService clienteService;
	
	public AlugarService(CarroService carroServ,ClienteService clienteService ) {
		super();
		this.carroServ = carroServ;
		this.clienteService = clienteService;
	}

	public void alugarCarro (int idcarro, int idcliente, int qtdDias) throws ServicoException {
		Carro car = carroServ.buscarCarro(idcarro);
		Cliente cliente = clienteService.buscarID(idcliente);
		if (car != null && car.getStatus() == 1 && cliente != null && cliente.getTipo() == 1) {
			System.out.println("ENTREI NO IF */***********************************/*");
			car.setStatus(0);
			carroServ.alterar(idcarro, car);
		}
		float valor = calcularpreco(car.getPreco(), qtdDias);
		inserirAlugados(idcarro, idcliente, valor);
		
	}
	
	public void inserirAlugados (int idcarro, int idcliente, float valor)  {
		Carro carro = carroServ.buscarCarro(idcarro);
		Cliente cliente = clienteService.buscarID(idcliente);
		alugarDAO.inserir(carro, cliente, valor);
	}
	public void remover (int id) {
		
	}
	
	public float calcularpreco(float id, int qtdDias) {
		return qtdDias*id; 
	}
	
	public Alugar buscarAlugados (int id) {
		return alugarDAO.buscar(id);
	}
	public ArrayList<Alugar> todosAlugados () {
		return this.alugarDAO.buscarAlugados();
	}

	@Override
	public void alugarProduto(int idcarro, int idcliente, int qtdDias) {
		// TODO Auto-generated method stub
		
	}

	

}
