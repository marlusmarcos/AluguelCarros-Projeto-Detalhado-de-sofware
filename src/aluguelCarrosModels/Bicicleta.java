package aluguelCarrosModels;

public class Bicicleta extends Produto{
	
	protected HashMap<Integer, String> comentarios = new HashMap<Integer, String>();
	
	public Bicicleta() {
		comentarios = new HashMap<Integer, String>();
	}
	
	public void setComentario (int id, String comentario) {
		comentarios.put(id, comentario);
	}

	public Bicicleta(String modelo, String cor, int dono, int status, float preco) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.dono = dono;
		this.status = status;
		this.preco = preco;
	}


	public Bicicleta(int id, String modelo, String cor, int dono, int status, float preco,
			HashMap<Integer, String> comentarios) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.cor = cor;
		this.dono = dono;
		this.status = status;
		this.preco = preco;
		this.comentarios = comentarios;
	}
}
