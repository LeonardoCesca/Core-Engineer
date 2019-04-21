package com.leonardocesca.jtscore.aula7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerosRomanosTest {

	private Conversor numeroRomano = new Conversor();
	private Conversor numeroInteiro = new Conversor();

	@Test
	public void testeDoNumero1() {
		assertEquals("I", numeroInteiro.converteInteirosEmRomanos(1));
	}

	@Test
	public void testeDoNumero15() {
		assertEquals("XV", numeroInteiro.converteInteirosEmRomanos(15));
	}

	@Test
	public void testeDoNumero4() {
		assertEquals("IV", numeroInteiro.converteInteirosEmRomanos(4));
	}

	@Test
	public void testeNum20() {
		assertEquals("XX", numeroInteiro.converteInteirosEmRomanos(20));
	}


	@Test
	public void testeDoNumero9() {
		assertEquals("IX", numeroInteiro.converteInteirosEmRomanos(9));
	}

	@Test
	public void testeDoNumeroII() {
		assertEquals(2, numeroRomano.converteRomanosEmInteiros("II"));
	}

	@Test
	public void testeDoNumeroI() {
		assertEquals(1, numeroRomano.converteRomanosEmInteiros("I"));
	}

	@Test
	public void testeDoNumeroIV() {
		assertEquals(4, numeroRomano.converteRomanosEmInteiros("IV"));
	}

	@Test
	public void testeDoNumeroIX() {
		assertEquals(9, numeroRomano.converteRomanosEmInteiros("IX"));
	}

	@Test
	public void testeDoNumeroVI() {
		assertEquals(6, numeroRomano.converteRomanosEmInteiros("VI"));
	}

	@Test
	public void testeDoNumeroXV() {
		assertEquals(15, numeroRomano.converteRomanosEmInteiros("XV"));
	}


}