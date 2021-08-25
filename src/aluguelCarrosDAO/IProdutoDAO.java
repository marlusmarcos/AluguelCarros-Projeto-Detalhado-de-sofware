package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Produto;

public interface IProdutoDAO {
	void inserir (Produto produto);
	int remover (int id);
	int alterar (int id, Produto produto);
	Produto buscar (int id);
	ArrayList<Produto> buscarProdutos();
	public int sequenciarId ();
}
