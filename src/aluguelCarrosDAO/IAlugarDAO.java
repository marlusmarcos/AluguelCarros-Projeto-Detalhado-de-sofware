package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;
//import aluguelCarrosService.ProdutoAlugarStrategy;

public interface IAlugarDAO {
	
	void inserir(Produto produto, Cliente cliente, float preco);
	int alterar (int id, Alugar alugar);
	Alugar buscar (int id);
	public ArrayList<Alugar> buscarProdutos();

}
