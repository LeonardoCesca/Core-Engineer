package com.leonardocesca.jtscore.aula7;

import java.util.HashMap;

public class Conversor {

	private int[] numerosInteiros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private String[] numerosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public String converteInteirosEmRomanos(int numeroInteiro) {
		String respostaNumeroRomano = "";
		if (numeroInteiro >= 1 && numeroInteiro <= 20) {
			for (int i = 0; i < numerosInteiros.length; i++) {
				while (numeroInteiro >= numerosInteiros[i]) {
					respostaNumeroRomano = respostaNumeroRomano + numerosRomanos[i];
					numeroInteiro = numeroInteiro - numerosInteiros[i];
				}
			}
		} else {
			System.out.println("\nO número digitado não está no intervalo permitido que é 1-20");
		}
		return respostaNumeroRomano;
	}

	public int converteRomanosEmInteiros(String numeroRomano) {
		
		int respostaRomano = 0;
		int numeroDireita = 0;
		
		for (int i = numeroRomano.length() - 1; i >= 0; i--) {
			int recebeTraducaoNumeralRomano = (int) traduzNumeroParaRomano(numeroRomano.charAt(i));
			if (recebeTraducaoNumeralRomano >= 1 && recebeTraducaoNumeralRomano <= 20) {
				respostaRomano = (int) (respostaRomano + recebeTraducaoNumeralRomano
						* Math.signum(recebeTraducaoNumeralRomano + 0.5 - numeroDireita));
				numeroDireita = recebeTraducaoNumeralRomano;
			} else {
				System.out.println("\nNúmero Romano resulta em valor fora do intervalo (1-20)");
			}
		}
		return respostaRomano;
	}

	private double traduzNumeroParaRomano(char caractere) {
		return Math.floor(Math.pow(10, "IXCM".indexOf(caractere)))+ 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
	}
}