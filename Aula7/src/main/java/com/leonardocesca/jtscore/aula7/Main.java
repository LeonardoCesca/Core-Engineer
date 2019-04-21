package com.leonardocesca.jtscore.aula7;

import java.util.Scanner;

public class Main {
	private static Conversor conversor = new Conversor();
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;

		while(true) {
			System.out.println("\n==========================Menu==========================\n\n" +
					"1 - Converter Inteiro para Romano\n" +
					"2 - Converter Romano para Inteiro\n" +
					"0 - Sair");
			opcao = teclado.nextInt();
			if (opcao == 0) {
				System.out.println("Saindo..");
				break;
			}
			switch (opcao) {
			case 1:
				converteArabicosEmRomanos(teclado);
				break;
			case 2: 
				converteRomanosParaInteiros(teclado);
				break;
			}
		}
		teclado.close();
	}
	public static void converteArabicosEmRomanos(Scanner teclado) {
		System.out.println("Digite um numero inteiro:");
		int numeroRecebido = teclado.nextInt();
		System.out.println(conversor.converteArabicosEmRomanos(numeroRecebido));		
	}
	public static void converteRomanosParaInteiros(Scanner teclado) {
		System.out.println("Digite um numero romano: ");
		String letra = teclado.nextLine();	
		System.out.println(conversor.converteRomanosEmInteiros(letra));
	}
}
