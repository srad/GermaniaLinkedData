package de.unifrankfurt.informatik.linkedopendata.model;

public class Match {
    final public Tag tag;
    final public String text;

    public Match(Tag tag, String text) {
        this.tag = tag;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Match(" + tag + ", \"" + text + "\")";
    }
}
