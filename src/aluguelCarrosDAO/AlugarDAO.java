package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;

public class AlugarDAO implements IAlugarDAO{
	protected ArrayList<Alugar> alugados;
	protected int setarId =0;// criar automaticamente id para controle
	public AlugarDAO() {
		this.alugados = new ArrayList<Alugar>();
		//this.setarId = 1;
	}	


	@Override
	public void inserir(Alugar alugar) {
		alugar.setId(sequenciarId());
		this.alugados.add(alugar);		
	}

	@Override
	public int remover(int id) {
		Alugar alugar = new Alugar ();
		for (Alugar c: alugados) {
			if (c.getId() == id) {
				alugar = c;
				break;
			}
		}
		alugados.remove(alugar);
		return alugar.getId();
	}

	@Override
	public int alterar(int id, Alugar alugar) {
		
		return 0;
	}

	@Override
	public Alugar buscar(int id) {
		for (Alugar c : alugados) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
		
	}

	@Override
	public ArrayList<Alugar> buscarAlugados() {
		return this.alugados;
		
	}
	public int setID () {
		this.setarId +=1;
		return this.setarId;
	}

	@Override
	public int sequenciarId() {
		// id atual será igual ao próximo id em sequencia
		int id = setID();
		return id;
	}

}
