package de.unifrankfurt.informatik.linkedopendata;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import de.unifrankfurt.informatik.linkedopendata.model.RdfModel;
import de.unifrankfurt.informatik.linkedopendata.reader.Entries;

public class GermaniaLinkedData {

    public static void main(String[] args) {
        try {
            Entries entries = new Entries("data/pgmc_v1_5.xml");
            final RdfModel rdf = new RdfModel(entries);
            rdf.writeEntriesDataStructureToFile("data/entries.txt");
            rdf.write("data/germania.rdf");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

}
