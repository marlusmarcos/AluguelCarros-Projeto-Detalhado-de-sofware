package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;

public class CarroDAO implements ICarroDAO{
	protected ArrayList<Carro> carros;
	protected int setarId =0;// criar automaticamente id para controle
	public CarroDAO() {
		this.carros = new ArrayList<Carro>();
		//this.setarId = 1;
	}	

	@Override
	public void inserir(Carro carro) {
		carro.setId(sequenciarId());
		this.carros.add(carro);
				
	}

	@Override
	public int remover(int id) {
		Carro carro = new Carro ();
		for (Carro c: carros) {
			if (c.getId() == id) {
				carro = c;
				break;
			}
		}
		carros.remove(carro);
		return carro.getId();
	}

	@Override
	public int alterar(int id, Carro carro) {
		for (Carro c : carros) {
			if (c.getId() == id) {
				c.setModelo(carro.getModelo());
				break;
			}
		}
		return 0;
	}

	@Override
	public Carro buscar(int id) {
		for (Carro c : carros) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Carro> buscarClientes() {
			return carros;
	}

	public int setID () {
		this.setarId +=1;
		return this.setarId;
	}
	public int sequenciarId() {
		// id atual será igual ao próximo id em sequencia
		int id = setID();
		return id;
	}

}
