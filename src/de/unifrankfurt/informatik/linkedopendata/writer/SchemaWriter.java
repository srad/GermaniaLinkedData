package de.unifrankfurt.informatik.linkedopendata.writer;

import com.hp.hpl.jena.graph.impl.LiteralLabelFactory;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class SchemaWriter {

	public SchemaWriter() {
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.RDFS_MEM);
		String NS = "http://informatik.uni-frankfurt/linkedopendata#";

		OntClass entry = model.createClass(NS + "Entry");
		//OntClass b = m.createClass(NS + "Lemma");
		OntProperty children = model.createOntProperty(NS + "children");

		//a.addSubClass(b);

		//OntProperty c = m.createOntProperty(NS + "children");
		//c.addRange(entry);

		model.write(System.out, "RDF/XML");
	}

}
