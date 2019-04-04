package com.leonardocesca.jtscore.aula7;

import java.util.Scanner;

public class Main {
	
	  private static Scanner numeroInteiro;
	  private static Scanner numeroRomano;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		numeroInteiro = new Scanner(System.in);
		numeroRomano = new Scanner(System.in);
		
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
				Conversor romano = new Conversor();
				System.out.println("Digite um numero inteiro:");
				int numero = numeroInteiro.nextInt();
				System.out.println(romano.converteInteirosEmRomanos(numero));
				break;
				
			case 2: 
				romano = new Conversor();
				System.out.println("Digite um numero romano: ");
				String letra = numeroRomano.nextLine();	
				System.out.println(romano.converteRomanosEmInteiros(letra));
				break;
			
			}
		}
	}
}