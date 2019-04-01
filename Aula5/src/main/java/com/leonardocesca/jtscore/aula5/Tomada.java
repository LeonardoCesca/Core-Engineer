package com.leonardocesca.jtscore.aula5;

public class Tomada {

	private Lampada lampada;
	private boolean verifica = false;

	public Tomada(Lampada lampada) {
		this.lampada = lampada;
	}

	void trocar() {
		
		if(verifica == true) {
			lampada.desliga();
			verifica = false;
		} else {
			lampada.liga();
			verifica = true;
		}
	}
	
	public boolean verifica () {
		return verifica;
	}

}
