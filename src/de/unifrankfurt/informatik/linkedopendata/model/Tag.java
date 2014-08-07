package de.unifrankfurt.informatik.linkedopendata.model;

import de.unifrankfurt.informatik.linkedopendata.model.type.AbstractTag;

public class Tag {

    final public String token;
    final public AbstractTag metaData;

    public Tag(String abbreviation, AbstractTag metaData) {
        this.token = abbreviation;
        this.metaData = metaData;
    }

    private String getRegEx() {
        return "^(\\s*\\S+\\s+|\\s+)*" + regexEscape(this.token);
    }

    public static String regexEscape(String s) {
        return s.replace(".", "\\.");
    }

    /**
     * @param abbr
     * @param text
     * @return
     */
    public boolean matches(final String text) {
        return text.matches(this.getRegEx() + ".*");
    }

    public String removeAbbrevationFromText(final String text) {
        return text.replaceAll("\\s" + regexEscape(this.token), "").replaceAll("^" + regexEscape(this.token), "");
    }

    @Override
    public String toString() {
        return "Tag(\"" + this.token + "\", " + this.metaData + ")";
    }
}