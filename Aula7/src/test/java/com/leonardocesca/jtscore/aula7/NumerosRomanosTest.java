package com.leonardocesca.jtscore.aula7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerosRomanosTest {

	private Conversor numeroRomano = new Conversor();
	private Conversor numeroInteiro = new Conversor();
	
	    @Test
	    public void testeNumeroI() {
	        assertEquals(1, numeroRomano.converteRomanosEmInteiros("I"));
	    }

	    @Test
	    public void testeNumeroIV() {
	        assertEquals(4, numeroRomano.converteRomanosEmInteiros("IV"));
	    }

	    @Test
	    public void testeNumeroXI() {
	        assertEquals(11, numeroRomano.converteRomanosEmInteiros("XI"));
	    }

	    @Test
	    public void testeNumeroXV() {
	        assertEquals(15, numeroRomano.converteRomanosEmInteiros("XV"));
	    }

	    @Test
	    public void testeNumeroIX() {
	        assertEquals(9, numeroRomano.converteRomanosEmInteiros("IX"));
	    }

	    @Test
	    public void testeNumero1() {
	        assertEquals("I", numeroInteiro.converteInteirosEmRomanos(1));
	    }

	    @Test
	    public void testeNumero2() {
	        assertEquals("II", numeroInteiro.converteInteirosEmRomanos(2));
	    }

	    @Test
	    public void testeNumero20() {
	        assertEquals("XX", numeroInteiro.converteInteirosEmRomanos(20));
	    }

	    @Test
	    public void testeNumero15() {
	        assertEquals("XV", numeroInteiro.converteInteirosEmRomanos(15));
	    }

	    @Test
	    public void testeNumero9() {
	        assertEquals("IX", numeroInteiro.converteInteirosEmRomanos(9));
	    }
	}