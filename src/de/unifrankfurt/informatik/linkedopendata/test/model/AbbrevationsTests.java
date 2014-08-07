package de.unifrankfurt.informatik.linkedopendata.test.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import de.unifrankfurt.informatik.linkedopendata.model.Abbreviations;
import de.unifrankfurt.informatik.linkedopendata.model.Match;
import de.unifrankfurt.informatik.linkedopendata.model.Tag;
import de.unifrankfurt.informatik.linkedopendata.model.type.Abbreviation;
import de.unifrankfurt.informatik.linkedopendata.model.type.Examples;
import eu.monnetproject.lemon.LemonModels;
import eu.monnetproject.lemon.impl.LemonElementImpl;
import eu.monnetproject.lemon.impl.LemonFactoryImpl;
import eu.monnetproject.lemon.model.LemonElement;

import org.junit.Test;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class AbbrevationsTests {

    @Test
    public void test_match_abbreviation() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        assertTrue(a.matches("z.b. ist das bla bla"));
    }

    @Test
    public void test_match_abbreviation2() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        assertTrue(a.matches("bla bla z.b. ist das bla bla"));
    }

    @Test
    public void test_match_abbreviation3() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        assertFalse(a.matches("bla blaz.b. ist das bla bla"));
    }

    @Test
    public void test_match_abbreviation4() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        assertFalse(a.matches("bla blaz.b.ist das bla bla"));
    }

    @Test
    public void test_remove_abbreviation() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        final String result = a.removeAbbrevationFromText("z.b. ist das bla bla");
        assertTrue(result.equals(" ist das bla bla"));
    }

    @Test
    public void test_remove_abbreviation2() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        final String result = a.removeAbbrevationFromText("bla blaz.b. ist das bla bla");
        assertTrue(result.equals("bla blaz.b. ist das bla bla"));
    }

    @Test
    public void test_remove_abbreviation3() {
        final Tag a = new Tag("z.b.", new Examples("zum Beispiel"));
        final String result = a.removeAbbrevationFromText("bla blaz.b.ist das bla bla");
        assertTrue(result.equals("bla blaz.b.ist das bla bla"));
    }

    @Test
    public void test_match_abbreviation6() {
        final Tag a = new Tag("v. o.", new Abbreviation("von oben"));
        assertTrue(a.matches("bla bla v. o. ist das bla bla"));
    }

    @Test
    public void test_match_abbreviation7() {
        final Tag a = new Tag("v. o.", new Abbreviation("von oben"));
        assertTrue(a.matches("v. o. ist das bla bla"));
    }

    @Test
    public void test_remove_abbreviation4() {
        final Tag a = new Tag("v. o.", new Abbreviation("von oben"));
        final String result = a.removeAbbrevationFromText("v. o.    von oben");
        assertTrue(result.equals("    von oben"));
    }

    @Test
    public void test_remove_abbreviation5() {
        final Tag a = new Tag("v. o.", new Abbreviation("von oben"));
        final String result = a.removeAbbrevationFromText("bla v. o.    von oben");
        assertTrue(result.equals("bla    von oben"));
    }

    @Test
    public void test_match_abbreviation8() {
        final Tag a = new Tag("v. o.", new Abbreviation("von oben"));
        assertTrue(a.matches("S. 544 Z. 2 v. o. mhd. sveige, zu lesen: sweige."));
    }

    @Test
    public void test_match_abbreviation9() {
        final Tag a = new Tag("v. o.", new Abbreviation("von oben"));
        assertTrue(a.matches(" 544 z. 2 v. o. mhd. sveige, zu lesen: sweige."));
    }

    @Test
    public void test_parse_abbreviations_1() {
        final String text = "S. 544 Z. 2 v. o. mhd. sveige, zu lesen: sweige.";
        final ArrayList<Match> map = new Abbreviations(text).parse();

        System.err.println(text);
        System.err.println(map);
        int hits = 0;

        for (Match match : map) {
            if (match.tag.token.equals("s.") || match.tag.token.equals("v. o.") || match.tag.token.equals("mhd.")) {
                hits += 1;
            }
        }
        assertTrue(hits == 3);
    }
    
    @Test
    public void test_parse_abbreviation_2() {
        final String text = "jj , hier gibts überhaupt keine abkürzungen!;";
        final ArrayList<Match> map = new Abbreviations(text).parse();
        
        System.err.println(text);
        System.err.println(map);

        assertTrue(map.size() == 0);
    }
    
    @Test
    public void test_find_abbreviation_substring() {
        final String text = "a. bla bla, z. B. cla cla; dla dla";
        final String result = Abbreviations.findSubstring("z. b.", text);
        assertTrue(result.equals("z. B. cla cla;"));
    }

    @Test
    public void test_find_abbreviation_substring2() {
        final String text = "i. cla cla; dla dla";
        final String result = Abbreviations.findSubstring("i.", text);
        assertTrue(result.equals("i. cla cla;"));
    }

    @Test
    public void test_lemon_model() {
        Model model = ModelFactory.createDefaultModel();
        model.setNsPrefix("g", "http://example.com/germania");
    }

}
