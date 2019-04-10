package com.leonardocesca.jtscore.aula8;

public class Cliente {
	
	private String nome;
	private String id;
	private int livrosAlugados;
	private int historicoLivrosAlugados;
	
	public Cliente(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLivrosAlugados() {
		return livrosAlugados;
	}

	public void setLivrosAlugados(int livrosAlugados) {
		this.livrosAlugados = livrosAlugados;
	}

	public int getHistoricoLivrosAlugados() {
		return historicoLivrosAlugados;
	}

	public void setHistoricoLivrosAlugados(int historicoLivrosAlugados) {
		this.historicoLivrosAlugados = historicoLivrosAlugados;
	}
	
	public String toString() {
		return "ID: " + id + " Nome: " + nome;
	}
}
