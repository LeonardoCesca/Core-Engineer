package com.leonardocesca.jtscore.aula5;

public class Fluorescente implements Lampada {

	@Override
	public void liga() {
		System.out.println("Ligando lampada Fluorescente!");
	}

	@Override
	public void desliga() {
		System.out.println("Desligando lampada Fluorescente!");
	}

}
