package com.leonardocesca.jtscore.aula8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GerenciadorLivro {

	private List<Livro> listaLivros = new ArrayList<>(); 
	private SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	private String path = "Livros.txt";


	public void cadastrarLivros(Livro livro) {
		listaLivros.add(livro);
		System.out.println("Livro Cadastrado!");
	}

	public String listarLivros() {
		StringBuffer stringBuffer = new StringBuffer();
		for(Livro livro : listaLivros) {
			stringBuffer.append(livro);
			stringBuffer.append(livro.isChecaDisponibilidade() ? "\n" : "Alugado");
		}

		return stringBuffer.toString();
	}

	public Livro buscarLivroAutor(String autor) {
		for(Livro livro : listaLivros) {
			if(livro.getAutor().contains(autor)) {
				return livro;
			}
		}
		return null;
	}

	public Livro buscarLivroTitulo(String titulo) {
		for(Livro livro : listaLivros) {
			if(livro.getTitulo().contains(titulo)) {
				return livro;
			}
		}
		return null;
	}

	public Livro buscarLivroId(String id) {
		for(Livro livro : listaLivros) {
			if(livro.getId().contains(id)) {
				return livro;
			}
		}
		return null;
	}

	public boolean removerLivro(String id) {
		Livro livro = buscarLivroId(id);
		if(livro == null) {
			System.out.println("Livro não encontrado!");
			return false;
		} else if (livro.isChecaDisponibilidade()){
			listaLivros.remove(livro);
			System.out.println("Livro " + id + " removido!");
			return true;
		}

		System.out.println("Livro alugado!");
		return false;
	}

	public boolean alugarLivro(String titulo, String dataDevolucao) {
		Livro livro = buscarLivroTitulo(titulo);
		if(livro == null) {
			System.out.println("Livro não encontrado!");
			return false;
		} else if (livro.isChecaDisponibilidade()){
			livro.setDataDevolucao(dataDevolucao);
			livro.setChecaDisponibilidade(false);
			System.out.println("Livro alugado com sucesso!");
			return true;
		}

		System.out.println("Livro não renovado!");
		return false;
	}

	public boolean devolverLivro(String id, String data) {
		Livro livro = buscarLivroId(id);
		if(livro == null) {
			System.out.println("Livro não encontrado");
			return false;
		}
		if (verificarAtraso(data, livro.getDataDevolucao()) < 8) {
			livro.setIdAluguel("null");
			livro.setChecaDisponibilidade(true);
			System.out.println( "Livro Ok!");
			return true;
		}
		long multa = (verificarAtraso(data, livro.getDataDevolucao()) - 7) * 5;
		livro.setIdAluguel("null");
		livro.setChecaDisponibilidade(true);
		System.out.println("Multa de R$" + multa);
		return true;
	}

	public long verificarAtraso(String data, String dataDevolucao) {
		try {
			Date dataDev = dataFormatada.parse(dataDevolucao);
			Date dataHoje = dataFormatada.parse(data);
			if(dataHoje.before(dataDev))
				return 0;
			else {
				long diff = dataHoje.getTime() - dataDev.getTime();
				return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public void cadastrarNoArquivo(Livro livro){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			bw.write(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getId());
			bw.newLine();
			System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getId());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizarArray(){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" - ");
                Livro livro = new Livro(parts[0],parts[1], parts[2]);
                listaLivros.add(livro);
            }
        } catch (IOException e) {
            System.out.println("Erro");
        }
    }


}
