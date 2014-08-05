package de.unifrankfurt.informatik.linkedopendata.test.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import de.unifrankfurt.informatik.linkedopendata.model.Abbreviations;
import de.unifrankfurt.informatik.linkedopendata.model.Abbreviation;

import org.junit.Test;

public class AbbrevationsTests {
	
	@Test
	public void test_match_abbreviation() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		assertTrue(a.matches("z.b. ist das bla bla"));
	}
	
	@Test
	public void test_match_abbreviation2() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		assertTrue(a.matches("bla bla z.b. ist das bla bla"));
	}
	
	@Test
	public void test_match_abbreviation3() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		assertFalse(a.matches("bla blaz.b. ist das bla bla"));
	}
	
	@Test
	public void test_match_abbreviation4() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		assertFalse(a.matches("bla blaz.b.ist das bla bla"));
	}
	
	@Test
	public void test_remove_abbreviation() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		final String result = a.removeAbbrevationFromText("z.b. ist das bla bla");
		assertTrue(result.equals(" ist das bla bla"));
	}
	
	@Test
	public void test_remove_abbreviation2() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		final String result = a.removeAbbrevationFromText("bla blaz.b. ist das bla bla");
		assertTrue(result.equals("bla blaz.b. ist das bla bla"));
	}
	
	@Test
	public void test_remove_abbreviation3() {
		final Abbreviation<String> a = new Abbreviation<String>("z.b.", "zum Beispiel");
		final String result = a.removeAbbrevationFromText("bla blaz.b.ist das bla bla");
		assertTrue(result.equals("bla blaz.b.ist das bla bla"));
	}
	
	@Test
	public void test_match_abbreviation6() {
		final Abbreviation<String> a = new Abbreviation<String>("v. o.", "von oben");
		assertTrue(a.matches("bla bla v. o. ist das bla bla"));
	}
	
	@Test
	public void test_match_abbreviation7() {
		final Abbreviation<String> a = new Abbreviation<String>("v. o.", "von oben");
		assertTrue(a.matches("v. o. ist das bla bla"));
	}
	
	@Test
	public void test_remove_abbreviation4() {
		final Abbreviation<String> a = new Abbreviation<String>("v. o.", "von oben");
		final String result = a.removeAbbrevationFromText("v. o.    von oben");
		assertTrue(result.equals("    von oben"));
	}
	
	@Test
	public void test_remove_abbreviation5() {
		final Abbreviation<String> a = new Abbreviation<String>("v. o.", "von oben");
		final String result = a.removeAbbrevationFromText("bla v. o.    von oben");
		assertTrue(result.equals("bla    von oben"));
	}
	
	@Test
	public void test_match_abbreviation8() {
		final Abbreviation<String> a = new Abbreviation<String>("v. o.", "von oben");
		assertTrue(a.matches("S. 544 Z. 2 v. o. mhd. sveige, zu lesen: sweige."));
	}
	
	@Test
	public void test_match_abbreviation9() {
		final Abbreviation<String> a = new Abbreviation<String>("v. o.", "von oben");
		assertTrue(a.matches(" 544 z. 2 v. o. mhd. sveige, zu lesen: sweige."));
	}
	
	@Test
	public void test() {
		final String text = "S. 544 Z. 2 v. o. mhd. sveige, zu lesen: sweige.";
		final HashMap<String, String> map = new Abbreviations(text).parse();
		
		System.err.println(text);
		System.err.println(map);
		
		assertTrue(map.containsKey("s."));
		assertTrue(map.containsKey("v. o."));
		assertTrue(map.containsKey("mhd."));
	}

}
