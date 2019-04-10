package com.leonardocesca.jtscore.aula8;

public class Livro {
	
	private String id;
	private String autor;
	private String titulo;
	private String idAluguel;
	private String dataDevolucao;
	private boolean checaDisponibilidade = true;
	
	public Livro (String id, String autor, String titulo) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdAluguel() {
		return idAluguel;
	}

	public void setIdAluguel(String idAluguel) {
		this.idAluguel = idAluguel;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public boolean isChecaDisponibilidade() {
		return checaDisponibilidade;
	}

	public void setChecaDisponibilidade(boolean checaDisponibilidade) {
		this.checaDisponibilidade = checaDisponibilidade;
	}
	
	@Override 
	public String toString() {
		return "ID: " + id + " - Autor: " + autor + " - Titulo: " + titulo;
	}

}
