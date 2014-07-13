package de.unifrankfurt.informatik.linkedopendata.reader;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang.StringEscapeUtils;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.unifrankfurt.informatik.linkedopendata.model.Entry;

public class Entries extends ArrayList<Entry> {

	private static final long serialVersionUID = 745978852286521518L;

	public Entries(final String fileName) throws ParserConfigurationException, SAXException, IOException {
		XmlReader reader = new XmlReader(fileName);
		NodeList entries = reader.getTag("entry");
		Entry lastParent = null;

		for (int i = 0; i < entries.getLength(); i++) {
			Node node = entries.item(i);
			NodeList children = node.getChildNodes();
			Entry entry = new Entry();
			NamedNodeMap attr = node.getAttributes();

			entry.setId(attr.getNamedItem("id").getNodeValue());
			entry.setParentId(attr.getNamedItem("parent").getNodeValue());

			for (int j = 0; j < children.getLength(); j++) {
				Node childNode = children.item(j);

				switch (childNode.getNodeType()) {
				case Node.ELEMENT_NODE:
					String nodeName = childNode.getNodeName();
					switch (nodeName.toLowerCase()) {
					case "lm":
						String lemma = childNode.getTextContent();
						entry.lemma = lemma;
						break;
					case "gr":
						String greece = childNode.getChildNodes().item(0)
								.getTextContent();
						entry.greece = StringEscapeUtils.unescapeXml(greece);
						break;
					case "oe":
						String oldEnglish = childNode.getTextContent();
						entry.oldEnglish = StringEscapeUtils
								.unescapeHtml(oldEnglish);
						break;
					default:
						System.err.println("Unbekannter Knoten: "
								+ childNode.getNodeName());
						break;
					}
					break;
				case Node.TEXT_NODE:
					String text = childNode.getTextContent();
					if (text.indexOf("lat.") != -1) {
						entry.setLatin(text);
					} else {
						entry.description = StringEscapeUtils.unescapeHtml(text);
					}
					break;
				default:
					System.err.println("Ignorierter Knoten: "
							+ childNode.getNodeName());
					break;
				}
			}
			if (lastParent == null || entry.parentId == null) {
				lastParent = entry;
			} else if (entry.parentId.equals(lastParent.id)) {
				lastParent.children.add(entry);
			}
			this.add(entry);
		}
	}

	@Override
	public String toString() {
		String s = "";

		for (Entry entry : this) {
			s += entry.toString() + "\n";
		}
		return s;
	}
}
