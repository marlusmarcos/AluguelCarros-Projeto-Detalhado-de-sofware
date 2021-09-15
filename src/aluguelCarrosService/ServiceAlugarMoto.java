package aluguelCarrosService;

//import aluguelCarrosDAO.AlugarContextDAO;
import ServoceExceptioin.ServicoException;
import aluguelCarrosDAO.AlugarContextDAO;
import aluguelCarrosDAO.IAlugarDAO;
import aluguelCarrosModels.Cliente;
import aluguelCarrosModels.Moto;
import aluguelCarrosModels.Produto;

//package aluguelCarrosService;

public class ServiceAlugarMoto implements ProdutoAlugarStrategy {

  AlugarContextDAO al = new AlugarContextDAO();

  @Override
  public void alugar(int idProduto, int idCliente, int qtdDias, ProdutoService produtoService,
      ClienteService clienteService, IAlugarDAO alugarContextDAO) {
    Produto produto = produtoService.buscar(idProduto);
    Cliente cliente = clienteService.buscarID(idCliente);
    float preco = produto.getPreco() * qtdDias;
    try {
      if (validar(cliente, produto)) {
        produto.setStatus(0);
        System.out.println(
            "MOTO ALUGADA COM SUCESSO!\n>>>> cliente: " + cliente.getNome() + "\n>>>> Moto: " + produto.getModelo());
        alugarContextDAO.inserir(produto, cliente, preco);
      }
    } catch (ServicoException e) {

      e.printStackTrace();
    }

  }

  public void validar() {
  }

  @Override
  public boolean validar(Cliente cliente, Produto moto) throws ServicoException {
    String erros = "";
    if (cliente.getCnh() != 'A' || cliente.getCnh() > 'A') {
      erros += "A CNH do cliente não tem autorização para alugar a moto\b";
    }
    if (moto.getStatus() != 1) {
      erros += "a moto não está disponível para ser alugada";
    }

    if (erros.length() > 0) {
      throw new ServicoException(erros);
    }
    return true;
  }

  @Override
  public void devolucao(int idProduto, int idCliente, ProdutoService produtoService, ClienteService clienteService,
      IAlugarDAO alugarContextDAO, String avaliacao) {
    Moto produto = (Moto) produtoService.buscar(idProduto);
    // Cliente cliente = clienteService.buscarID(idCliente);
    produto.setStatus(1);
    produto.setComentario(idCliente, avaliacao);

  };
}
