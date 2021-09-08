import java.util.Date;

import ServoceExceptioin.ServicoException;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosService.CarroService;
import aluguelCarrosService.ClienteService;
import view.ViewCasos;
//import aluguelCarrosService.IClienteService;

public class Main {
	
	public static void main (String [] args) throws ServicoException {
		//Date date = new Date ();
		ViewCasos vw = new ViewCasos();
		vw.buscarProdTodos();
		vw.cadastrarClientes();
		//vw.alterarCliente();
		vw.cadastraUmCarro();
		vw.cadastraUmaMoto();
		/*-----------------*/
		vw.buscarProduto(1);
		vw.buscarTodos();
		vw.alugarUmProduto();
		vw.buscarProdTodos();
		vw.carrosAlugados();
		System.out.println("\n-----fazendo devolução do carro:-------");
		vw.devolucao();
		vw.buscarProdTodos();
		//vw.devolucao();
		
		
	}
	
}
