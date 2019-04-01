package com.leonardocesca.jtscore.aula5;

public class Interruptor {

	private Lampada lampada;
	private boolean status = false;

	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
	}

	public boolean trocar() {
		
		if(status == true) {
			lampada.desliga();
			status = false;
		} else {
			lampada.liga();
			status = true;
		}
		
		return status;
	}
}
