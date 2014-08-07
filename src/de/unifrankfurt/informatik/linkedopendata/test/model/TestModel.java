package de.unifrankfurt.informatik.linkedopendata.test.model;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

import de.unifrankfurt.informatik.linkedopendata.model.Match;
import de.unifrankfurt.informatik.linkedopendata.model.Tag;
import de.unifrankfurt.informatik.linkedopendata.model.lemon.LemonXmlBuilder;
import de.unifrankfurt.informatik.linkedopendata.model.type.Language;

public class TestModel {

    @SuppressWarnings("serial")
    @Test
    public void test_jena_model() {
        LemonXmlBuilder builder = new LemonXmlBuilder();
        
        builder.addEntry("Wurst", "de", new ArrayList<Match>() {{
            add(new Match(new Tag("de.", new Language("de", "de")), "wurst"));
            add(new Match(new Tag("en.", new Language("en", "en")), "sausage"));
            add(new Match(new Tag("lat.", new Language("lat", "lat")), "wurstus"));
        }});
        
        builder.addEntry("orange", "de", new ArrayList<Match>() {{
            add(new Match(new Tag("de.", new Language("de", "de")), "orange"));
            add(new Match(new Tag("lat.", new Language("lat", "lat")), "orangus"));
        }});
        
        final String testFile = "data/test.rdf";
        File f = new File(testFile);
        if (f.exists()) {
            f.delete();
        }
        builder.writeToFile(testFile);
        assertTrue(new File(testFile).exists());
    }
}
