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
		Date date = new Date ();
		ViewCasos vw = new ViewCasos();
		vw.cadastrarClientes();
//		vw.cadastrarCarro();
		//vw.alterarCliente();
		vw.cadastraUmCarro();
		vw.buscarProduto(1);
		vw.buscarTodos();
		vw.alugarUmProduto();
		vw.carrosAlugados();
		System.out.println("CARROS DISPONÍVEIS");
		vw.buscarProdTodos();
		
		
	}
	
}
