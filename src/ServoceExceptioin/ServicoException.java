package ServoceExceptioin;

import java.util.ArrayList;

public class ServicoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ServicoException(ArrayList<String> message) {
		super(message.toString());
	}
	public ServicoException(String message) {
		super(message);
	}

}
