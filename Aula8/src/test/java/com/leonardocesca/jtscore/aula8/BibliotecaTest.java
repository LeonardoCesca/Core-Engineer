package com.leonardocesca.jtscore.aula8;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BibliotecaTest {
	private GerenciadorLivro gerenciadorLivros = new GerenciadorLivro();
	private GerenciadorPessoa gerenciadorCliente = new GerenciadorPessoa();

	@Test
	public void adicionarLivro() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		gerenciadorLivros.adicionarLivro(livro);
		assertEquals(livro, gerenciadorLivros.buscarLivroPorAutor("Autor1"));
	}

	@Test
	public void listarLivro() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		assertEquals("Autor: Autor2 - Titulo: Titulo2 - ID: 9999\n" +
				"Autor: Autor1 - Titulo: Titulo1 - ID: 1111\n", gerenciadorLivros.listarLivro());
	}

	@Test
	public void buscarLivroPorAutor() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		assertEquals(livro, gerenciadorLivros.buscarLivroPorAutor("Autor1"));
	}

	@Test
	public void buscarLivroPorTitulo() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		assertEquals(livro, gerenciadorLivros.buscarLivroPorTitulo("Titulo1"));
	}

	@Test
	public void removerLivro() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		gerenciadorLivros.removerLivro("9999");
		assertEquals("Autor: Autor1 - Titulo: Titulo1 - ID: 1111\n", gerenciadorLivros.listarLivro());
	}

	@Test
	public void alugarLivro() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		gerenciadorLivros.alugarLivro("Titulo1", "02795636042", "09/04/2019");
		assertEquals(true,gerenciadorLivros.devolverLivro("1111",  "09/04/2019"));
	}

	@Test
	public void renovarLivro() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		gerenciadorLivros.alugarLivro("Titulo1", "02795636042", "09/04/2019");
		assertEquals(true, gerenciadorLivros.renovarLivro("1111","02795636042", "10/04/2019","10/04/2019"));
	}

	@Test
	public void listarLivrosAlugados() {
		Livro livro = new Livro("Titulo1", "Autor1", "1111");
		Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
		gerenciadorLivros.adicionarLivro(livro1);
		gerenciadorLivros.adicionarLivro(livro);
		gerenciadorLivros.alugarLivro("Titulo1", "Nome: a CPF: 2", "01/08/2018");
		assertEquals("Autor: Autor1 - Titulo: Titulo1 - ID: 1111 - Cliente Nome: a CPF: 2\n", gerenciadorLivros.listarLivrosAlugados());
	}

//	@Test
//	public void listarTopsLivrosAlugados() {
//		gerenciadorCliente.atualizarArray();
//		assertEquals("Cliente: n    Livros Alugados: 55\n" +
//				"Cliente: i    Livros Alugados: 23\n" +
//				"Cliente: h    Livros Alugados: 13\n" +
//				"Cliente: j    Livros Alugados: 10\n" +
//				"Cliente: g    Livros Alugados: 9\n" +
//				"Cliente: f    Livros Alugados: 8\n" +
//				"Cliente: e    Livros Alugados: 7\n" +
//				"Cliente: d    Livros Alugados: 6\n" +
//				"Cliente: c    Livros Alugados: 5\n" +
//				"Cliente: m    Livros Alugados: 5\n", gerenciadorCliente.listarTopPessoas());
//	}
	
//	@Test
//    public void listarLivrosAtrasados() {
//        Livro livro = new Livro("Titulo1", "Autor1", "1111");
//        Livro livro2 = new Livro("Titulo3", "Autor2", "1000");
//        Livro livro1 = new Livro("Titulo2", "Autor2", "9999");
//
//        gerenciadorLivros.adicionarLivro(livro1);
//        gerenciadorLivros.adicionarLivro(livro);
//        gerenciadorLivros.adicionarLivro(livro2);
//        gerenciadorLivros.alugarLivro("Titulo2", "Nome: a CPF: 2", "030/08/2018");
//        gerenciadorLivros.alugarLivro("Titulo1", "Nome: a CPF: 2", "028/08/2018");
//        gerenciadorLivros.alugarLivro("Titulo3", "Nome: a CPF: 2", "20/09/2018");
//        assertEquals("Autor: Autor2 - Titulo: Titulo2 - ID: 9999 - Cliente Nome: a CPF: 2 Dias de atraso: 6\n" +
//                              "Autor: Autor1 - Titulo: Titulo1 - ID: 1111 - Cliente Nome: a CPF: 2 Dias de atraso: 8\n", gerenciadorLivros.listarAtrasados("05/09/2018"));
//    }


}