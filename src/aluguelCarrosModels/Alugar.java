package aluguelCarrosModels;

import java.util.Date;

public class Alugar {
	protected int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	protected Produto idprod;
	protected Cliente idcliente;
	protected Date dataInicio;
	protected Date dataFim;
	protected int qtdDias;
	protected float preco;

	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public int getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Produto getProduto() {
		return idprod;
	}
	public void setCarro(Produto produto) {
		this.idprod = produto;
	}
	public Cliente getCliente() {
		return idcliente;
	}
	public void setCliente(Cliente cliente) {
		this.idcliente = cliente;
	}

}
