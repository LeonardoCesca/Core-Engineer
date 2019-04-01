package com.leonardocesca.jtscore.aula5;

public abstract class Main {

	public static void main(String[] args) {
		
		Lampada led = new Led();
		
		Interruptor interruptor = new Interruptor(led);
		interruptor.trocar();
		interruptor.trocar();

	}

}
