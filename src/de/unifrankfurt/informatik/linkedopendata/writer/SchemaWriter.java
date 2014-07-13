package de.unifrankfurt.informatik.linkedopendata.writer;

import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.impl.LiteralLabelFactory;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.RDFVisitor;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;

public class SchemaWriter {

	public SchemaWriter() {
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.RDFS_MEM);
		model.setNsPrefix("uni", "http://informatik.uni-frankfurt/germania");
		String NS = "http://informatik.uni-frankfurt/linkedopendata#";

		OntClass entry = model.createClass("Entry");
		//OntClass b = m.createClass(NS + "Lemma");
		//OntProperty children = model.createOntProperty(NS + "children");

		//a.addSubClass(b);

		//OntProperty c = m.createOntProperty(NS + "children");
		//c.addRange(entry);

		model.write(System.out, "RDF/XML");
	}

}
