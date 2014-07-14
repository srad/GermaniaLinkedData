package de.unifrankfurt.informatik.linkedopendata.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.util.Iterator;

import net.lexinfo.LexInfo;
import de.unifrankfurt.informatik.linkedopendata.model.RdfModel;
import de.unifrankfurt.informatik.linkedopendata.reader.Entries;
import de.unifrankfurt.informatik.linkedopendata.model.Entry;
import eu.monnetproject.lemon.LemonFactory;
import eu.monnetproject.lemon.LemonModel;
import eu.monnetproject.lemon.LemonModels;
import eu.monnetproject.lemon.LemonSerializer;
import eu.monnetproject.lemon.LinguisticOntology;
import eu.monnetproject.lemon.model.LexicalEntry;
import eu.monnetproject.lemon.model.LexicalForm;
import eu.monnetproject.lemon.model.Lexicon;
import eu.monnetproject.lemon.model.Text;

public class LemonRdfWriter {

	Entries entries;
	String ns;

	public LemonRdfWriter(Entries entries) {
		this.entries = entries;
		this.ns = RdfModel.ns;
	}

	public void write() throws IOException {
		final LemonSerializer serializer = LemonSerializer.newInstance();
		final LemonModel model = serializer.create();
		final Lexicon lexicon = model.addLexicon(URI.create(ns), "en");
		final LinguisticOntology lingOnto = new LexInfo();

		try (OutputStreamWriter w = new OutputStreamWriter(System.out/*"data/germania.rdf"*/)) {
			for (Entry collectionEntry : entries) {
				final LexicalEntry entry = LemonModels.addEntryToLexicon(
						lexicon, URI.create(ns + collectionEntry.id),
						collectionEntry.lemma,
						URI.create(ns + collectionEntry.lemma));

				final LemonFactory factory = model.getFactory();

				if (collectionEntry.greece != null) {
					LexicalForm greece = factory.makeForm();
					greece.setWrittenRep(new Text(collectionEntry.greece, "gr"));
					entry.addOtherForm(greece);
				}

				if (collectionEntry.oldEnglish != null) {
					LexicalForm oldEnglish = factory.makeForm();
					oldEnglish.setWrittenRep(new Text(
							collectionEntry.oldEnglish, "oe"));
					entry.addOtherForm(oldEnglish);
				}

				if (collectionEntry.latin != null) {
					LexicalForm latin = factory.makeForm();
					latin.setWrittenRep(new Text(collectionEntry.latin, "lt"));
					entry.addOtherForm(latin);
				}

				lexicon.addEntry(entry);
				serializer.writeEntry(model, entry, lingOnto, w);
			}
		}
	}
}
