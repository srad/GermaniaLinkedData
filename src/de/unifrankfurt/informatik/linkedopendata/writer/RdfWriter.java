package de.unifrankfurt.informatik.linkedopendata.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.hp.hpl.jena.rdf.model.Model;

public class RdfWriter {

	Model model;

	public RdfWriter(final Model model) throws FileNotFoundException, IOException {
		this.model = model;
		
		try (FileOutputStream w = new FileOutputStream("data/germania.rdf")) {
			model.write(w);
		}
	}

}
