package aluguelCarrosModels;

public class Cliente {
	protected int id;
	protected String cpf;
	protected String nome;
	protected String email;
	protected int idade;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	protected int tipo;
	protected char cnh;
	
	
	public char getCnh() {
		return cnh;
	}
	public void setCnh(char cnh) {
		this.cnh = cnh;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
