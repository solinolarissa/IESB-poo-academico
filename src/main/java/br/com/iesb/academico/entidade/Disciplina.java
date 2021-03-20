package br.com.iesb.academico.entidade;

public class Disciplina {

	private String codigo;
	private String nome;
	private Integer cargaHorario;
	
	public Disciplina() {
		super();
	}

	public Disciplina(String codigo, String nome, Integer cargaHorario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHorario = cargaHorario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHorario() {
		return cargaHorario;
	}

	public void setCargaHorario(Integer cargaHorario) {
		this.cargaHorario = cargaHorario;
	}
	
}
