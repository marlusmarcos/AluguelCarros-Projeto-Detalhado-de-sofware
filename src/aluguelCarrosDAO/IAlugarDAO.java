package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;


public interface IAlugarDAO {
	int remover (int id);
	int alterar (int id, Alugar alugar);
	Alugar buscar (int id);
	ArrayList<Alugar> buscarAlugados();
	public int sequenciarId ();
	void inserir(Carro idcarro, Cliente idcliente, float preco);
	void calcularPreco(int dias, float preco);
	
}
