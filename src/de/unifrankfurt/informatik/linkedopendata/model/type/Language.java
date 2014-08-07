package de.unifrankfurt.informatik.linkedopendata.model.type;

public class Language extends AbstractTag {

    public final String isoCode;

    public Language(String token, String isoCode) {
        super(token);
        this.isoCode = isoCode;
    }

}
