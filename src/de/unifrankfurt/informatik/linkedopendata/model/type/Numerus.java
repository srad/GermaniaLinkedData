package de.unifrankfurt.informatik.linkedopendata.model.type;

public class Numerus extends AbstractTag {
    final public Type type;

    public static enum Type {
        SINGULAR, PLURAL
    }

    public Numerus(Type type, String token) {
        super(token);
        this.type = type;
    }

}