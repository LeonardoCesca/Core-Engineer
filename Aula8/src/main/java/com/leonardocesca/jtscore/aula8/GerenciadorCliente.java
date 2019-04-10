package com.leonardocesca.jtscore.aula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {

	private List<Cliente> listaClientes = new ArrayList<>(); 
	private String path = "Clientes.txt";


	public void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
		System.out.println("Cliente Cadastrado!");
	}

	public String listarClientes() {
		StringBuffer stringBuffer = new StringBuffer();
		for(Cliente cliente : listaClientes) {
			stringBuffer.append(cliente);
		}

		return stringBuffer.toString();
	}

	public Cliente buscarPorId(String id) {
		for(Cliente cliente : listaClientes) {
			if(cliente.getId().contains(id)) {
				return cliente;
			}
		}
		return null;
	}

	public boolean emprestarLivro(String id) {
		for(Cliente cliente : listaClientes) {
			if(cliente.getLivrosAlugados() < 5) {
				cliente.setLivrosAlugados(cliente.getLivrosAlugados() + 1);
				cliente.setHistoricoLivrosAlugados(cliente.getHistoricoLivrosAlugados() + 1);
				return true;
			}
		}
		return false;
	}

	public boolean devolverLivro(String id) {
		for(Cliente cliente : listaClientes) {
			if(cliente.getId().contains(id)) {
				cliente.setLivrosAlugados(cliente.getLivrosAlugados() - 1);
				System.out.println("Cliente ok!");
				return true;
			}
		}
		return false;
	}


	public void atualizarArray(){
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" - ");
				Cliente cliente = new Cliente(parts[0],parts[1]);
				listaClientes.add(cliente);
			}
		} catch (IOException e) {
			System.out.println("Erro");
		}
	}


}
