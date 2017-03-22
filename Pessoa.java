package aula05;

public class Pessoa {
	private String nome;
	private String cpf;
	private int nascimento;
	
	public Pessoa(){}

	public Pessoa(String nome, String cpf, int nasc){
		setNome(nome);
		setCpf(cpf);
		setNascimento(nasc);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
}
