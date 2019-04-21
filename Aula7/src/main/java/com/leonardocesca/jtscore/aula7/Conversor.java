package com.leonardocesca.jtscore.aula7;

import java.util.HashMap;

public class Conversor {

	private int[] numerosArabicos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private String[] numerosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public String converteArabicosEmRomanos(int numeroArabico) {
		String respostaNumeroRomano = "";
		verificaIntervalo(numeroArabico);
		for (int i = 0; i < numerosArabicos.length; i++) {
			while (numeroArabico >= numerosArabicos[i]) {
				respostaNumeroRomano = respostaNumeroRomano + numerosRomanos[i];
				numeroArabico = numeroArabico - numerosArabicos[i];
			}
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
			}
		}
		return respostaRomano;
	}

	private double traduzNumeroParaRomano(char caractere) {
		return Math.floor(Math.pow(10, "IXCM".indexOf(caractere)))+ 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
	}

	private int verificaIntervalo(int numero) {
		if (numero >= 1 && numero <= 20) {
			return numero;
		} else {
			System.out.println("Numero Fora do intervalo de 1-20");
			System.exit(0);
		}
		return numero;
	}
}