package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Alugar;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Produto;
//import aluguelCarrosService.ProdutoServiceStrategy;

public class AlugarContextDAO implements IAlugarDAO{
	ArrayList <Alugar> alugados;
	protected int setarId;
	public AlugarContextDAO() {
		this.alugados = new ArrayList<Alugar>();
	}

	public void setSetarId() {
		this.setarId +=1;
	}
	public int sequenciarID() {
		setSetarId();
		return this.setarId;
	}

	
	
	public void inserir(Produto produto, Cliente cliente, float preco) {
		Alugar alugar = new Alugar();
		alugar.setId(sequenciarID());
		alugar.setCarro(produto);
		alugar.setCliente(cliente);
		alugar.setPreco(preco);
		alugados.add(alugar);
	
	}
	public 	int alterar (int id, Alugar alugar) {
		return 1;
	}
	public Alugar buscar (int id) {
		return alugados.get(id-1);
	}
	public ArrayList<Alugar> buscarProdutos() {
		return this.alugados;
	}
}
