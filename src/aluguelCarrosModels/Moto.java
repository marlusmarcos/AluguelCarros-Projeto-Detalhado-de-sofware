package aluguelCarrosModels;

import java.util.HashMap;

public class Moto extends Produto {
	protected HashMap<Integer, String> comentarios = new HashMap<Integer, String>();;	
	public Moto() {
		comentarios = new HashMap<Integer, String>();
	}
	
	public void setComentario (int id, String comentario) {
		comentarios.put(id, comentario);
	}

	public Moto(String modelo, String placa, String cor, int dono, int status, float d) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.dono = dono;
		this.status = status;
		this.preco = d;
	}


	public Moto(int id, String modelo, String placa, String cor, int dono, int status, float preco,
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


}
