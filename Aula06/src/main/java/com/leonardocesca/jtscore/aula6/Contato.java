package com.leonardocesca.jtscore.aula6;

public class Contato {
	private String nome;
	private int id;

	public Contato(int id, String nome) {
		this.id = id;
		this.nome = nome;

	}

	public void setContato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return nome + " ID: " + id;
	}

}
