package com.leonardocesca.jtscore.aula8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		GerenciadorLivro gerenciadorLivro = new GerenciadorLivro();
		GerenciadorCliente gerenciadorCliente = new GerenciadorCliente();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dataHoje = dateFormat.format(new Date());

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 7);
		String devolucaoDia = dateFormat.format(calendar.getTime());
		
		gerenciadorCliente.atualizarArray();
		gerenciadorLivro.atualizarArray();

		while(true) {
			System.out.println("=========Menu=========\n"+
					"1 - Adicionar livro\n" +
					"2 - Listar livros\n" +
					"3 - Buscar livro por autor\n" +
					"4 - Buscar livro titulo\n" +
					"5 - Buscar livro id\n" +
					"6 - Remover livro\n" +
					"7 - Adicionar cliente\n" +
					"8 - Listar cliente\n" +
					"9 - Alugar livro\n" +
					"10 - Devolver livro\n" +
					"0 - Sair"

					);

			int opcao = scan.nextInt();

			if(opcao == 0) {
				break;
			}

			switch(opcao) {

			case 1: 
				System.out.println("Digite o titulo do livro: ");
				String titulo = scan.next();
				System.out.println("Digite o autor do livro: ");
				String autor = scan.next();
				System.out.println("Digite o ID do livro: ");
				String id = scan.next();

				Livro livro = new Livro(id, autor, titulo);
				gerenciadorLivro.cadastrarLivros(livro);
				break;

			case 2: 
				System.out.println(gerenciadorLivro.listarLivros());
				break;

			case 3:
				System.out.println("Digite o nome do autor do livro: ");
				autor = scan.next();
				System.out.println(gerenciadorLivro.buscarLivroAutor(autor));
				break;

			case 4: 
				System.out.println("Digite o titulo do livro: ");
				titulo = scan.next();
				System.out.println(gerenciadorLivro.buscarLivroTitulo(titulo));
				break;

			case 5:
				System.out.println("Digite o id do livro: ");
				id = scan.next();
				System.out.println(gerenciadorLivro.buscarLivroId(id));
				break;

			case 6: 
				System.out.println("Digite o id do livro para remover: ");
				id = scan.next();
				System.out.println(gerenciadorLivro.removerLivro(id));
				break;

			case 7:
				System.out.println("Digite o nome do cliente: ");
				String nomeCliente = scan.next();
				System.out.println("Digite o ID do cliente: ");
				id = scan.next();

				Cliente cliente = new Cliente(id, nomeCliente);
				gerenciadorCliente.cadastrarCliente(cliente);
				break;

			case 8: 
				System.out.println(gerenciadorCliente.listarClientes());
				break;

			case 9:
				System.out.println("Digite o titulo do livro que deseja alugar: ");
				titulo = scan.next();
				System.out.println("Digite o seu id (cliente): ");
				id = scan.next();

				if(gerenciadorCliente.emprestarLivro(id)) {
					System.out.println(gerenciadorLivro.alugarLivro(titulo, gerenciadorCliente.buscarPorId(id).getId()));
				} else {
					System.out.println("Livro não encontrado!");
				}
				break;
				
			case 10: 
				System.out.println("Digite o id do livro para devolução: ");
				id = scan.next();
				System.out.println("Digite o id do cliente para devolução: ");
				String idCliente = scan.next();
				
				if(gerenciadorLivro.devolverLivro(idCliente, dataHoje)) {
					gerenciadorCliente.devolverLivro(idCliente);
					System.out.println("Livro devolvido!");
				}
				
			}

		}

	}

}
