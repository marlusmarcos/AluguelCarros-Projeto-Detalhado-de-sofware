package aluguelCarrosService;


public interface IAlugarProdService {
	void alugarProduto (int idcarro, int idcliente, int qtdDias);
	void inserirAlugados (int idcarro, int idcliente, float valor);
	float calcularpreco(float id, int qtdDias);
	//AlugarProdService buscarAlugados (int id);
	//ArrayList<AlugarProdService> todosAlugados ();

}
