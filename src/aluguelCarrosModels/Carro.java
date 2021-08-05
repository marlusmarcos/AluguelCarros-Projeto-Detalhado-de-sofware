package aluguelCarrosModels;

//import java.util.ArrayList;
import java.util.HashMap;

public class Carro {
	protected int id;
	protected String modelo;
	protected String placa;
	protected String cor;
	protected int dono;
	protected int status;
	protected float preco;
	protected HashMap<Integer, String> comentarios;	
	public Carro() {
		super();
	}
	

	public Carro(String modelo, String placa, String cor, int dono, int status, float d) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.dono = dono;
		this.status = status;
		this.preco = d;
	}


	public Carro(int id, String modelo, String placa, String cor, int dono, int status, float preco,
			HashMap<Integer, String> comentarios) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.dono = dono;
		this.status = status;
		this.preco = preco;
		this.comentarios = comentarios;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getDono() {
		return dono;
	}
	public void setDono(int dono) {
		this.dono = dono;
	}
	public void setStatus (int status) {
		this.status = status;
	}
	public int getStatus() {
		return this.status;
	}
}
