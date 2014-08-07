package de.unifrankfurt.informatik.linkedopendata.model.lemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang.StringEscapeUtils;

import de.unifrankfurt.informatik.linkedopendata.model.Match;
import de.unifrankfurt.informatik.linkedopendata.model.type.Language;

public class LemonXmlBuilder {

    public final String ns = "http://informatik.uni-frankfurt.de/Germania";

    private StringBuffer content;

    private final String ls = "\n";

    private final String startContainer = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + ls
            + "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:lemon=\"http://www.monnet-project.eu/lemon#\">" + ls
            + "  <lemon:Lexicon rdf:about=\"http://informatik.uni-frankfurt.de/Germania\" lemon:language=\"gem\">" + ls;

    private String endContainer = "  </lemon:Lexicon>" + ls + "</rdf:RDF>";

    public LemonXmlBuilder() {
        this.content = new StringBuffer();
    }

    public void addEntry(String lemma, String lang, ArrayList<Match> writtenRep) {
        lemma = StringEscapeUtils.escapeHtml(lemma);
        this.content.append(
                  "    <lemon:entry>" + ls
                + "      <lemon:LexicalEntry rdf:about=\"" + ns + "/" + lemma + "\">" + ls

                + "        <lemon:form>" + ls
                + "          <lemon:canonicalForm rdf:about=\"" + ns + "/" + lemma + "/canonicalForm\">"
                +                buildWrittenRep(writtenRep) + ls
                + "          </lemon:canonicalForm>" + ls
                + "        </lemon:form>" + ls

                + "        <lemon:sense>" + ls
                + "          <lemon:LexicalSense rdf:about=\"" + ns + "#" + lemma + "/sense\">" + ls
                + "            <lemon:reference rdf:resource=\"http://dbpedia.org/resource/" + lemma + "\"/>" + ls
                + "          </lemon:LexicalSense>" + ls
                + "        </lemon:sense>" + ls

                + "      </lemon:LexicalEntry>" + ls + "    </lemon:entry>" + ls);
    }

    private String buildWrittenRep(ArrayList<Match> writtenRep) {
        StringBuffer s = new StringBuffer();

        for (Match entry : writtenRep) {
            if (entry.tag.metaData instanceof Language) {
                String lang = ((Language) entry.tag.metaData).isoCode;
                String word = entry.text;
                if (!word.trim().equals("")) {
                    s.append(ls + "            <lemon:writtenRep xml:lang=\"" + lang + "\">" + (word) + "</lemon:writtenRep>");
                }
            }
        }

        return s.toString();
    }

    @Override
    public String toString() {
        return startContainer + content.toString() + endContainer;
    }

    public void writeToFile(String fileName) {
        FileOutputStream out;
        try {
            out = new FileOutputStream(new File(fileName));
            out.write(this.toString().getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
