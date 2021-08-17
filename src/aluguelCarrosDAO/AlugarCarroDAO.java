package aluguelCarrosDAO;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;

public class AlugarCarroDAO implements IAlugarDAOStrategy{
	protected ArrayList<Alugar> alugados;
	Alugar alugar = new Alugar();
	protected int setarId =0;// criar automaticamente id para controle
	public AlugarCarroDAO() {
		this.alugados = new ArrayList<Alugar>();
		//this.setarId = 1;
	}	


	@Override
	public void inserir(Carro idcarro, Cliente idcliente, float preco) {
		Alugar alugar = new Alugar();
		alugar.setId(sequenciarId());
		alugar.setCliente(idcliente);
		alugar.setCarro(idcarro);
		alugar.setPreco(preco);
		this.alugados.add(alugar);		
	}

/*	@Override
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
*/
	@Override
	public int alterar(int id, Alugar alugar) {
		
		return 0;
	}
/*
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
*/	
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

/*
	@Override
	public void calcularPreco(int dias, float preco) {
	
		
	}
*/

}
