package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Bicicleta;
import aluguelCarrosModels.Carro;

public class BicicletaDAO implements IBicicletaDAO{
	protected ArrayList<Bicicleta> bicicletas;
	protected int setarId =0;

	@Override
	public void inserir(Bicicleta bicicleta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int remover(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alterar(int id, Bicicleta bicicleta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bicicleta buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Bicicleta> buscarBicicletas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sequenciarId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
