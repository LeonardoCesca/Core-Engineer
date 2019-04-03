package com.leonardocesca.jtscore.aula6;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	List<Contato> listaContatos = new ArrayList<>();

	public void adicionarContato(Contato contato) {
		listaContatos.add(contato);
		System.out.println("Contato adicionado!");
	}

	public int listarContatos() {
		for (Contato c : listaContatos) {
			System.out.println("Contato: " + c);
		}
		return listaContatos.size();
	}

	public int buscarNome(String nome) {
		for (Contato c : listaContatos) {
			if (c.getNome().contains(nome)) {
				return c.getId();
			}
		}
		System.out.println("Não encontrado");
		return 0;
	}

	public String buscarId(int id) {
		for (Contato c : listaContatos){
			if (c.getId() == id ) {
				return c.getNome();
			}
		}
		System.out.println("Não encontrado");
		return null;
	}

	public boolean removerContato(String nome) {
		for (Contato c : listaContatos){
			if(c.getNome().contains(nome)) {
				listaContatos.remove(c);
				System.out.println("Contato " + nome + " removido");
				return true;
			}
		}
		System.out.println("Contato não encontrado");
		return false;
	}
}