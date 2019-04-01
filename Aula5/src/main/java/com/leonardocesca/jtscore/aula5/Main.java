package com.leonardocesca.jtscore.aula5;

public abstract class Main {

	public static void main(String[] args) {
		Lampada led = new Led();
		
		Interruptor recLed = new Interruptor(led);
		recLed.trocar();
		recLed.trocar();
		recLed.trocar();
	}

}
