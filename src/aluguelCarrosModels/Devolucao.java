package aluguelCarrosModels;

public class Devolucao {
	protected int idCarro;
	protected int idCliente;
	protected float acrescimo;
	public int getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public float getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(float acrescimo) {
		this.acrescimo = acrescimo;
	}
}
