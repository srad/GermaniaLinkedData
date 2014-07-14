package de.unifrankfurt.informatik.linkedopendata.model;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.lang.StringEscapeUtils;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;

import de.unifrankfurt.informatik.linkedopendata.reader.Entries;

public class RdfModel {

	private Entries entries;
	public final static String ns = "http://informatik.uni-frankfurt/germania/";

	public RdfModel(final Entries entries) {
		this.entries = entries;
	}

	public Model generate() {
		Model model = ModelFactory.createDefaultModel();
		model.setNsPrefix("g", ns);

		Property hasLemma = model.createProperty(ns + "hasMember");
		Property lemma = model.createProperty(ns + "lemma");
		Property greece = model.createProperty(ns + "greece");
		Property oldEnglish = model.createProperty(ns + "oldEnglish");
		Property latin = model.createProperty(ns + "latin");
		Property children = model.createProperty(ns + "children");

		for (Entry entry : entries) {
			Resource dict = model.createResource(ns + "dict");
			Resource e = model.createResource(ns + "entry");
			//Resource e = model.createResource(ns + "");

			e.addProperty(
					lemma,
					entry.lemma == null ? "" : StringEscapeUtils
							.escapeXml(entry.lemma));
			if (entry.greece != null) {
				e.addProperty(greece, StringEscapeUtils.escapeXml(entry.greece));
			}
			if (entry.oldEnglish != null) {
				e.addProperty(oldEnglish,
						StringEscapeUtils.escapeXml(entry.oldEnglish));
			}
			if (entry.latin != null) {
				e.addProperty(latin, StringEscapeUtils.escapeXml(entry.latin));
			}

			if (entry.parentId != null) {
				e.addProperty(children, model.createResource(ns + entry.id));
			}

			if (false && entry.parentId != null) {
				Property childOf = model.createProperty(ns + "childOf");
				Resource child = model.createResource(ns + entry.id);
				Resource parentLemma = model
						.createResource(ns + entry.parentId);
				model.add(model.createStatement(child, childOf, parentLemma));
			}

			model.add(model.createStatement(dict, hasLemma, e));
		}

		return model;
	}

}
