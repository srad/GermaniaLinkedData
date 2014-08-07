package de.unifrankfurt.informatik.linkedopendata.model.type;

public class Genus extends AbstractTag {
    final public Type type;
    
    public Genus(Type type, String token) {
        super(token);
        this.type = type;
    }

    public static enum Type {
        MASCULINE, FEMININ, NEUTRUM
    }
}