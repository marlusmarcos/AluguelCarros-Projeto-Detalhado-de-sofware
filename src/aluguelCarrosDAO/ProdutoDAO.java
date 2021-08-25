package aluguelCarrosDAO;

import java.util.ArrayList;

import aluguelCarrosModels.Produto;

public class ProdutoDAO implements IProdutoDAO {
	ArrayList<Produto> produtos;
	
	public ProdutoDAO( ) {
		super();
		produtos = new ArrayList<Produto>();
	}
	protected int setarId;

	@Override
	public void inserir(Produto produto) {
		produto.setId(this.sequenciarId());
		produtos.add(produto);		
	}

	@Override
	public int remover(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alterar(int id, Produto produto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Produto buscar(int id) {
		
		return produtos.get(id-1);
	}

	@Override
	public ArrayList<Produto> buscarProdutos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int setID () {
		this.setarId +=1;
		return this.setarId;
	}
	public int sequenciarId() {
		// id atual será igual ao próximo id em sequencia
		int id = this.setID();
		return id;
	}

}
