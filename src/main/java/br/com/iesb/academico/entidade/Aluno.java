package br.com.iesb.academico.entidade;

public class Aluno {

	private String nome;
	private Integer matricula;
	private Integer cpf;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, Integer matricula, Integer cpf) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	
}
