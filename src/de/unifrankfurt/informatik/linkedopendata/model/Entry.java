package de.unifrankfurt.informatik.linkedopendata.model;

import java.util.ArrayList;

import org.apache.commons.lang.StringEscapeUtils;

import de.unifrankfurt.informatik.linkedopendata.model.type.Language;

public class Entry {

    public enum abbreviationType {
        ABBREVIATION, RAWTEXT
    };

    public String htmlId;
    public String id;
    public String lemma;
    public String parentId;
    public String greek;
    public String oldEnglish;
    public String description;
    public ArrayList<Match> descriptionMetaData = new ArrayList<Match>();
    public String latin;
    public Children children = new Children();

    @Override
    public String toString() {
        return "id: " + this.id + ", children: " + children + ", parent-id: " + this.parentId + ", Lemma: " + lemma + ", Greece: " + greek + ", Old English: "
                + oldEnglish + ", Latin: " + latin + ", Description: " + description + ", meta: " + descriptionMetaData;
    }

    public void setId(final String id) {
        this.id = formatId(id);
        this.htmlId = StringEscapeUtils.escapeHtml(this.id);
    }

    public void setLemma(String lemma) {
        this.lemma = lemma.trim();
        descriptionMetaData.add(new Match(new Tag("de", new Language("German", "gem")), lemma));
    }

    /**
     * The ids in parent="..." differ from id="..." although they are the same.
     * This setter normalizes them.
     * 
     * @param id
     * @return
     */
    private String formatId(final String id) {
        return id.replaceFirst("b[0]+", "");
    }

    public void setParentId(final String parentId) {
        if (parentId.trim().equals("")) {
            this.parentId = null;
        } else {
            this.parentId = parentId;
        }
    }

    public void setOldEnglish(String oldEnglish) {
        this.oldEnglish = oldEnglish;
        descriptionMetaData.add(new Match(new Tag("oe", new Language("Old English", "ang")), oldEnglish));
    }

    public void setGreek(String greek) {
        this.greek = greek;
        descriptionMetaData.add(new Match(new Tag("gr", new Language("Greek", "gre")), greek));
    }

    /**
     * Search for known abbreviations and attach them to this Entry if any
     * found.
     * 
     * @param text
     */
    public void setDescription(final String text) {
        ArrayList<Match> foundAbbreviations = new Abbreviations(text).parse();

        if (foundAbbreviations.size() > 0) {
            this.descriptionMetaData.addAll(foundAbbreviations);
        }

        // From 0 to ";|\n" is the main description
        int separatorIndex = text.indexOf(";");
        if (separatorIndex == -1) {
            separatorIndex = text.length() - 1;
        }
        this.description = text.substring(0, separatorIndex);

        /*
         * System.err.println("--------------------------------------------------"
         * ); System.err.println("text:" + text);
         * System.err.println("found-abbreviations:" + foundAbbreviations);
         * System.err.println("description:" + this.description);
         */
    }
}
