package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;

public class AlugarMotoDAO implements IAlugarDAOStrategy {

	@Override
	public int remover(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alterar(int id, Alugar alugar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alugar buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Alugar> buscarAlugados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sequenciarId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void inserir(Carro idcarro, Cliente idcliente, float preco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularPreco(int dias, float preco) {
		// TODO Auto-generated method stub
		
	}

}
