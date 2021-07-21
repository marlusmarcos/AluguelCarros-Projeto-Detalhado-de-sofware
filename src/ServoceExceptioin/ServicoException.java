package ServoceExceptioin;

import java.util.ArrayList;

public class ServicoException extends Exception {

	public ServicoException(ArrayList<String> message) {
		super(message.toString());
	}
	public ServicoException(String message) {
		super(message);
	}

}
