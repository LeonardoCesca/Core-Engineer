package com.leonardocesca.jtscore.aula5;

public abstract class Main {

	public static void main(String[] args) {
		Lampada led = new Led();
		
		Tomada recLed = new Tomada(led);
		recLed.trocar();
		recLed.trocar();
		recLed.trocar();
	}

}
