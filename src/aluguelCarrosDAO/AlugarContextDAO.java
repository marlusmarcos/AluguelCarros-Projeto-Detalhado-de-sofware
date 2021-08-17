package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosService.ProdutoServiceStrategy;

public class AlugarContextDAO {
	IAlugarDAOStrategy alugarDAOStrategy;
	ProdutoServiceStrategy produtoServiceStrategy;
	public void inserir(Carro idcarro, Cliente idcliente, float preco) {
		
	}
public 	int alterar (int id, Alugar alugar) {
	return 1;
}
public int remover(int id) {
	Alugar alugar = new Alugar ();
	Object alugados;
	for (Alugar c: alugados) {
		if (c.getId() == id) {
			alugar = c;
			break;
		}
	}
	alugados.remove(alugar);
	return alugar.getId();
}	
	public Alugar buscar (int id) {
		Alugar alugar = new Alugar();
		return alugar;
	}
public 	ArrayList<Alugar> buscarAlugados() {
	return null;
}
public	void calcularPreco(int dias, float preco) {
}
	public int sequenciarId () {
		return 0;
	}
}
