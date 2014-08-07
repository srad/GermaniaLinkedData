package de.unifrankfurt.informatik.linkedopendata.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import de.unifrankfurt.informatik.linkedopendata.model.lemon.LemonXmlBuilder;
import de.unifrankfurt.informatik.linkedopendata.reader.Entries;

public class RdfModel {

    private final Entries entries;
    private LemonXmlBuilder builder;

    public RdfModel(final Entries entries) {
        this.entries = entries;
        this.builder = new LemonXmlBuilder();
    }
    
    public void write(String fileName) {
        for(Entry entry : entries) {
            builder.addEntry(entry.lemma, "deu", entry.descriptionMetaData);
        }
        builder.writeToFile(fileName);
    }
    
    public void writeEntriesDataStructureToFile(String fileName) {
        FileOutputStream out;
        try {
            out = new FileOutputStream(new File(fileName));
            out.write(entries.toString().getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
