package de.unifrankfurt.informatik.linkedopendata.reader;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {
	
	private org.w3c.dom.Document doc;

	public XmlReader(String fileName) throws ParserConfigurationException, SAXException, IOException {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
	}
	
	public Document getDocument() {
		return doc;
	}
	
	public NodeList getTag(String name) {
		return doc.getElementsByTagName(name);
	}

}
