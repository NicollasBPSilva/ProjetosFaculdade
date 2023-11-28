package Aula5.Atividade_ListaNegra;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String motivo;
	private Date inclusao;

	Pessoa(String nome,String motivo, Date inclusao){
		this.nome = nome;
		this.motivo = motivo;
		this.inclusao = inclusao;
	}
	
	Pessoa(String nome){
		this.nome = nome;
	}

	public Date getInclusao() {
		return inclusao;
	}

	public void setInclusao(Date inclusao) {
		this.inclusao = inclusao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getMotivo() {
		return this.motivo;
	}
}
