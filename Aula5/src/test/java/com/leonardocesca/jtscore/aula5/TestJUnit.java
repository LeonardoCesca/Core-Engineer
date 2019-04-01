package com.leonardocesca.jtscore.aula5;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit {


	@Test
	public void CriaLedERetornaOff() {
		
		Led led = new Led();
		Interruptor interruptor = new Interruptor(led);
		assertFalse(interruptor.verifica());
	}
	
	@Test
	public void CriaLedERetornaOn() {
		
		Lampada led = new Led();
		Interruptor interruptor = new Interruptor(led);
		
		interruptor.verifica();
		interruptor.trocar();
		
		Assert.assertTrue(interruptor.verifica());
	}

}
