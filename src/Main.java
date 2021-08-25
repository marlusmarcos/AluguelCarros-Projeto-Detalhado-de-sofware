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
		vw.alterarCliente();
//		vw.carrosDisponiveis();
//		vw.alugarCarro(1,1, 8);
//		vw.carrosDisponiveis();
//		System.out.println("CARROS ALUGADOS =================");
//		vw.carrosAlugados();
//		vw.carrosClienteAlugados();
//		System.out.println("Date:" + date.getDate() + "\nMes: " + date.getMonth() + "\nAno: " + (date.getYear()+1900));
//		vw.informar();
		vw.cadastraUmCarro();
		vw.buscarProduto(1);
		
	}
	
}
