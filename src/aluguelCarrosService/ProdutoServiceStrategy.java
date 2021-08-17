package aluguelCarrosService;

public interface ProdutoServiceStrategy {
	void alugar (int idProduto, int idCliente, int qtdDias);
	 void inserir (ProdutoServiceStrategy produto);
}
