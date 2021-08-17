package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Moto;

public class MotoDAO implements IMotoDAO{
	ArrayList<Moto> motos = new ArrayList();

	@Override
	public void inserir(Moto moto) {
		this.motos.add(moto);
	}

	@Override
	public int remover(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alterar(int id, Moto moto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Moto buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Moto> buscarMotos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sequenciarId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
