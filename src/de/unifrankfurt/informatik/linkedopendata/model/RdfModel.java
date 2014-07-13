package de.unifrankfurt.informatik.linkedopendata.model;

import java.io.IOException;
import java.io.OutputStream;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;

import de.unifrankfurt.informatik.linkedopendata.reader.Entries;

public class RdfModel {

	private Entries entries;
	private final static String ns = "http://informatik.uni-frankfurt/germania/";

	public RdfModel(final Entries entries) {
		this.entries = entries;
	}

	public Model generate() {
		Model model = ModelFactory.createDefaultModel();

		for (Entry entry : entries) {
			Resource dict = model.createResource(ns + "dictionary");
			Property hasLemma = model.createProperty(ns + "hasMember");
			Resource lemma = model.createResource(ns + entry.lemma);

			Statement s = model.createStatement(dict, hasLemma, lemma);
			model.add(s);
		}
		
		return model;
	}

}
