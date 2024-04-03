package fr.emse.test;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Before;
import org.junit.Test;

public class Moneytest {

	Money m12CHF;
	Money m14CHF;
	
	 @Before
	 public void unitmoney() {
		  m12CHF = new Money(12, "CHF"); // cr�ation de donn�es
		  m14CHF = new Money(14, "CHF");
	 }
	@Test
	public void testSimpleAdd() {
	
	Money expected = new Money(26, "CHF");
	Money result = m12CHF.add(m14CHF); // ex�cution de la m�thode test�e
	assertTrue(expected.equals(result)); // comparaison
	}
	@Test
	public void testEquals() {
	assertTrue(!m12CHF.equals(null)); 
	assertEquals(m12CHF, m12CHF);
	assertEquals(m12CHF, new Money(12, "CHF"));
	assertTrue(!m12CHF.equals(m14CHF));
	}
}

