package com.leonardocesca.jtscore.aula5;

public class Interruptor {

	private Lampada lampada;
	private boolean status;

	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
	}

	public void trocar() {

		if(this.status) {
			this.status = false;
			lampada.desliga();
		} else {
			this.status = true;
			lampada.liga();
		}
	}

	public boolean verifica () {
		return status;
	}

}
