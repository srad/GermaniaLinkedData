package de.unifrankfurt.informatik.linkedopendata.model;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class GermaniaLexicon {

    protected static final String uri = "http://informatik.uni-frankfurt.de/Germania/";
    protected static final String lemon = "http://www.monnetproject.eu/lemon#";

    /**
     * returns the URI for this schema
     * 
     * @return the URI for this schema
     */
    public static String getURI() {
        return uri;
    }

    private static Model m = ModelFactory.createDefaultModel();

    public static final Property Entry = m.createProperty(lemon + "entry");
    public static final Property Form = m.createProperty(lemon + "form");
    public static final Property LexicalEntry = m.createProperty(lemon + "LexicalEntry");
    public static final Property Lexicon = m.createProperty(lemon + "Lexicon");

    public static final Resource ADRTYPES = m.createResource(uri + "ADRTYPES");
    public static final Resource NPROPERTIES = m.createResource(uri + "NPROPERTIES");
    public static final Resource EMAILTYPES = m.createResource(uri + "EMAILTYPES");
    public static final Resource TELTYPES = m.createResource(uri + "TELTYPES");
    public static final Resource ADRPROPERTIES = m.createResource(uri + "ADRPROPERTIES");
    public static final Resource TZTYPES = m.createResource(uri + "TZTYPES");
    public static final Property Street = m.createProperty(uri, "Street");
    public static final Property AGENT = m.createProperty(uri, "AGENT");
    public static final Property SOURCE = m.createProperty(uri, "SOURCE");
    public static final Property LOGO = m.createProperty(uri, "LOGO");
    public static final Property BDAY = m.createProperty(uri, "BDAY");
    public static final Property REV = m.createProperty(uri, "REV");
    public static final Property SORT_STRING = m.createProperty(uri, "SORT-STRING");
    public static final Property Orgname = m.createProperty(uri, "Orgname");
    public static final Property CATEGORIES = m.createProperty(uri, "CATEGORIES");
    public static final Property N = m.createProperty(uri, "N");
    public static final Property Pcode = m.createProperty(uri, "Pcode");
    public static final Property Prefix = m.createProperty(uri, "Prefix");
    public static final Property PHOTO = m.createProperty(uri, "PHOTO");
    public static final Property FN = m.createProperty(uri, "FN");
    public static final Property ORG = m.createProperty(uri, "ORG");
    public static final Property Suffix = m.createProperty(uri, "Suffix");
    public static final Property CLASS = m.createProperty(uri, "CLASS");
    public static final Property ADR = m.createProperty(uri, "ADR");
    public static final Property Region = m.createProperty(uri, "Region");
    public static final Property GEO = m.createProperty(uri, "GEO");
    public static final Property Extadd = m.createProperty(uri, "Extadd");
    public static final Property GROUP = m.createProperty(uri, "GROUP");
    public static final Property EMAIL = m.createProperty(uri, "EMAIL");
    public static final Property UID = m.createProperty(uri, "UID");
    public static final Property Family = m.createProperty(uri, "Family");
    public static final Property TZ = m.createProperty(uri, "TZ");
    public static final Property NAME = m.createProperty(uri, "NAME");
    public static final Property Orgunit = m.createProperty(uri, "Orgunit");
    public static final Property Country = m.createProperty(uri, "Country");
    public static final Property SOUND = m.createProperty(uri, "SOUND");
    public static final Property TITLE = m.createProperty(uri, "TITLE");
    public static final Property NOTE = m.createProperty(uri, "NOTE");
    public static final Property MAILER = m.createProperty(uri, "MAILER");
    public static final Property Other = m.createProperty(uri, "Other");
    public static final Property Locality = m.createProperty(uri, "Locality");
    public static final Property Pobox = m.createProperty(uri, "Pobox");
    public static final Property KEY = m.createProperty(uri, "KEY");
    public static final Property PRODID = m.createProperty(uri, "PRODID");
    public static final Property Given = m.createProperty(uri, "Given");
    public static final Property LABEL = m.createProperty(uri, "LABEL");
    public static final Property TEL = m.createProperty(uri, "TEL");
    public static final Property NICKNAME = m.createProperty(uri, "NICKNAME");
    public static final Property ROLE = m.createProperty(uri, "ROLE");
}
