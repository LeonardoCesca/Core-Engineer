package com.leonardocesca.jtscore.aula5;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testeTrocarOff() {
		Lampada led = new Led();
		Interruptor interruptorLed = new Interruptor(led);
		
		Assert.assertEquals(false, interruptorLed.trocar());
	}
	
	@Test
	public void testeTrocarOn() {
		Lampada led = new Led();
		Interruptor interruptorLed = new Interruptor(led);
		
		Assert.assertEquals(true, interruptorLed.trocar());
	}

}
