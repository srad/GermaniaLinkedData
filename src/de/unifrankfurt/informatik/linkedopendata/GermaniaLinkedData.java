package de.unifrankfurt.informatik.linkedopendata;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.hp.hpl.jena.rdf.model.Model;

import de.unifrankfurt.informatik.linkedopendata.model.RdfModel;
import de.unifrankfurt.informatik.linkedopendata.reader.Entries;
import de.unifrankfurt.informatik.linkedopendata.writer.RdfWriter;
import de.unifrankfurt.informatik.linkedopendata.writer.SchemaWriter;

public class GermaniaLinkedData {

	public static void main(String[] args) {
		try {
			Entries entries = new Entries("data/pgmc_v1_5.xml");
			RdfModel rdf = new RdfModel(entries);
			RdfWriter r = new RdfWriter(rdf.generate());
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

}
