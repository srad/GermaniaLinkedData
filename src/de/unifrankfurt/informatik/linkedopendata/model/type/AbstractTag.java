package de.unifrankfurt.informatik.linkedopendata.model.type;

abstract public class AbstractTag {
    public final String token;

    public AbstractTag(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(\"" + token + "\")";
    }

    @Override
    public int hashCode() {
        return token.hashCode();
    }
}