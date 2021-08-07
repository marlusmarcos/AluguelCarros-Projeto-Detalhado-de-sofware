import ServoceExceptioin.ServicoException;
import aluguelCarrosModels.Carro;
import aluguelCarrosModels.Cliente;
import aluguelCarrosService.CarroService;
import aluguelCarrosService.ClienteService;
import view.ViewCasos;
//import aluguelCarrosService.IClienteService;

public class Main {
	
	public static void main (String [] args) throws ServicoException {
		ViewCasos vw = new ViewCasos();
		vw.cadastrarClientes();
		vw.cadastrarCarro();
		vw.alterarCliente();
		vw.carrosDisponiveis();
		vw.alugarCarro(1,1);
		vw.carrosDisponiveis();
		System.out.println("CARROS ALUGADOS =================");
		vw.carrosAlugados();
		vw.carrosClienteAlugados();

		
	}
	
}
