package com.leonardocesca.jtscore.aula5;

public abstract class Main {

	public static void main(String[] args) {
		
		Led led = new Led();
		
		Interruptor interruptor = new Interruptor(led);
		
		interruptor.verifica();
		interruptor.trocar();

	}

}
