package de.unifrankfurt.informatik.linkedopendata;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import de.unifrankfurt.informatik.linkedopendata.reader.Entries;
import de.unifrankfurt.informatik.linkedopendata.writer.SchemaWriter;

public class GermaniaLinkedData {

	public static void main(String[] args) {
		try {
			Entries entries = new Entries("data/pgmc_v1_5.xml");
			SchemaWriter writer = new SchemaWriter();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

}
