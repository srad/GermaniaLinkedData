package de.unifrankfurt.informatik.linkedopendata.model;

import java.util.ArrayList;

import de.unifrankfurt.informatik.linkedopendata.model.type.Abbreviation;
import de.unifrankfurt.informatik.linkedopendata.model.type.Attribute;
import de.unifrankfurt.informatik.linkedopendata.model.type.Examples;
import de.unifrankfurt.informatik.linkedopendata.model.type.Genus;
import de.unifrankfurt.informatik.linkedopendata.model.type.Language;
import de.unifrankfurt.informatik.linkedopendata.model.type.Numerus;
import de.unifrankfurt.informatik.linkedopendata.model.type.Obsolete;
import de.unifrankfurt.informatik.linkedopendata.model.type.Reference;
import de.unifrankfurt.informatik.linkedopendata.model.type.Tempus;
import de.unifrankfurt.informatik.linkedopendata.model.type.Variant;

public class Abbreviations {

    final String text;

    public Abbreviations(String text) {
        this.text = text;
    }

    /**
     * Ordered by parser look ahead priority descending, don't move the order or
     * the groups.
     */
    @SuppressWarnings({ "serial" })
    private final static ArrayList<Tag> tags = new ArrayList<Tag>() {
        {
            add(new Tag("nordfries.", new Language("nordfriesisch", "frr")));
            add(new Tag("ursprüngl.", new Obsolete("ursprünglich")));

            add(new Tag("mundartl.", new Variant("mundartlich")));
            add(new Tag("ostfries.", new Language("ostfriesisch", "frs")));
            add(new Tag("altfries.", new Language("altfriesisch", "ofs")));
            add(new Tag("westgerm.", new Language("westgermanisch", "gem")));
            add(new Tag("westfläm.", new Language("westflämisch", "gem")));

            add(new Tag("neunorw.", new Language("neunorwegisch", "nor")));
            add(new Tag("Grundwz.", new Reference("Grundwurzel")));
            add(new Tag("praepos.", new Attribute("Präposition")));
            add(new Tag("Nebenwz.", new Reference("Nebenwurzel")));
            add(new Tag("neupers.", new Language("neupersisch", "per")));
            add(new Tag("ModNorw.", new Language("Modern Norwegian", "nor")));
            add(new Tag("nschwed.", new Language("neuschwedisch", "swe")));
            add(new Tag("schweiz.", new Language("schweizerdeutsch", "gsw")));
            add(new Tag("aschwed.", new Language("altschwedisch", "swe-old")));
            add(new Tag("eigentl.", new Reference("eigentlich")));
            add(new Tag("spätmhd.", new Language("spätmittelhochdeutsch", "gmh")));
            add(new Tag("westfäl.", new Language("westfälisch", "wep")));

            add(new Tag("nfries.", new Language("neufriesisch", "frs")));
            add(new Tag("m.engl.", new Language("Mittelenglisch", "enm")));
            add(new Tag("neuisl.", new Language("neuisländisch", "ice")));
            add(new Tag("ofries.", new Language("ostfriesisch", "frs")));
            add(new Tag("preuss.", new Language("Preussisch", "prg")));
            add(new Tag("redupl.", new Attribute("redupliziert")));
            add(new Tag("präpos.", new Attribute("Präposition")));
            add(new Tag("german.", new Language("germanisch", "gem")));
            add(new Tag("griech.", new Language("Griechisch", "gre")));
            //add(new Tag("Hesych.", new Language("Hesychios"))); ???
            add(new Tag("intens.", new Attribute("Intensivum")));
            add(new Tag("klruss.", new Language("kleinrussisch", "ukr")));
            add(new Tag("langob.", new Language("langobardisch", "gem")));
            add(new Tag("schwäb.", new Language("schwäbisch", "gem")));
            add(new Tag("schwed.", new Language("schwedisch", "swe")));
            add(new Tag("superl.", new Attribute("Superlativ")));
            add(new Tag("unpers.", new Attribute("unpersönlich")));
            add(new Tag("u. dgl.", new Abbreviation("und dergleichen")));
            add(new Tag("wfries.", new Language("westfriesisch", "fry")));
            add(new Tag("altlat.", new Language("altlateinisch", "lat")));
            add(new Tag("afries.", new Language("altfriesisch", "ofs")));
            add(new Tag("afränk.", new Language("altfränkisch", "frk")));
            add(new Tag("causat.", new Attribute("Kausativ")));
            add(new Tag("compar.", new Attribute("Komparativ")));
            add(new Tag("dissim.", new Attribute("dissimilierend")));

            //add(new Tag("ModHG.", new Language("Modern High German")));
            //add(new Tag("nslav.", new Language("nordslawisch")));
            add(new Tag("nslov.", new Language("neuslowenisch", "slv")));
            //add(new Tag("oberd.", new Language("oberdeutsch", "")));
            add(new Tag("partc.", new Attribute("Partizip")));
            add(new Tag("praef.", new Attribute("Präfix")));
            add(new Tag("praep.", new Attribute("Präposition")));
            add(new Tag("praes.", new Tempus("Präsens")));
            add(new Tag("praet.", new Tempus("Präteritum")));
            add(new Tag("preuß.", new Language("Preussisch", "prg")));
            //add(new Tag("Pruss.", new Language("Prussian")));
            add(new Tag("subst.", new Attribute("Substantive")));
            //add(new Tag("tirol.", new Language("tirolerisch")));
            add(new Tag("trans.", new Attribute("transitiv")));
            add(new Tag("u.s.w.", new Abbreviation("und so weiter")));
            add(new Tag("urspr.", new Reference("ursprünglich")));
            add(new Tag("vergl.", new Reference("vergleiche")));
            add(new Tag("neutr.", new Genus(Genus.Type.NEUTRUM, "sächlich")));
            add(new Tag("altir.", new Language("altirisch", "sga")));
            add(new Tag("OIcel.", new Language("Old Norse (i.e. Old Icelandic)", "non")));
            //add(new Tag("acymr.", new ??("altcymrisch")));
            add(new Tag("apers.", new Language("altpersisch", "peo")));
            add(new Tag("aschw.", new Language("altschwedisch", "non")));
            //add(new Tag("OSlav.", new Language("Old Slavic")));
            //add(new Tag("denom.", new Attribute("denominal")));
            add(new Tag("dimin.", new Attribute("Diminutiv")));
            add(new Tag("eigtl.", new Reference("eigentlich")));
            add(new Tag("fries.", new Language("friesisch", "frs")));
            add(new Tag("instr.", new Attribute("Instrumental")));
            add(new Tag("mengl.", new Language("Mittelenglisch", "enm")));

            //add(new Tag("zend.", new Language("zendisch")));
            add(new Tag("nnorw", new Language("Neunorwegisch", "nor")));
            //add(new Tag("mndl.", new Language("Mittelniederländisch")));
            //add(new Tag("mlat.", new Language("mittellatenisch")));
            add(new Tag("nndl.", new Language("neuniederländisch", "nld")));
            //add(new Tag("Nord.", new Language("nordisch")));
            add(new Tag("o. ä.", new Abbreviation("oder ähnliches")));
            add(new Tag("pron.", new Attribute("Pronomen")));
            add(new Tag("umbr.", new Language("umbrisch", "xum")));
            add(new Tag("WGmc.", new Language("West Germanic", "gem")));
            add(new Tag("u. a.", new Abbreviation("unter anderem")));
            add(new Tag("v. o.", new Abbreviation("von oben")));
            add(new Tag("v. u.", new Abbreviation("von unten")));
            add(new Tag("e. g.", new Abbreviation("for example")));
            add(new Tag("refl.", new Attribute("reflexiv")));
            add(new Tag("d. i.", new Abbreviation("das ist")));
            add(new Tag("engl.", new Language("englisch", "eng")));
            add(new Tag("ModE.", new Language("English", "eng")));
            add(new Tag("finn.", new Language("finnisch", "fin")));
            add(new Tag("gael.", new Language("gaelisch", "gla")));
            add(new Tag("gall.", new Language("altgall.", "xcg")));
            add(new Tag("germ.", new Language("germanisch", "gem")));
            add(new Tag("Goth.", new Language("Gothic", "got")));
            add(new Tag("hess.", new Language("hessisch", "qia")));
            add(new Tag("intr.", new Attribute("intransitiv")));
            add(new Tag("kelt.", new Language("keltisch", "cel")));
            add(new Tag("kret.", new Language("kretisch", "ecr")));
            add(new Tag("lett.", new Language("lettisch", "lvs")));
            add(new Tag("Latv.", new Language("Latvian", "lvs")));
            add(new Tag("Lith.", new Language("Lithuanian", "lt")));
            add(new Tag("prät.", new Tempus("Präteritum")));
            add(new Tag("MDut.", new Language("Middle Dutch", "dum")));
            //add(new Tag("adän.", new Language("altdänisch")));
            //add(new Tag("aeol.", new Language("aeolisch")));
            //add(new Tag("angl.", new Language("anglisch")));
            //add(new Tag("amhd.", new Language("alt-")));
            add(new Tag("bair.", new Language("bairisch", "bar")));
            add(new Tag("bulg.", new Language("bulgarisch", "bul")));
            add(new Tag("caus.", new Attribute("Kausativ")));
            add(new Tag("comp.", new Attribute("Komparativ")));
            add(new Tag("conj.", new Attribute("Konjunktion")));
            //add(new Tag("cymr.", new Language("cymrisch")));
            add(new Tag("dass.", new Abbreviation("dasselbe")));
            add(new Tag("fläm.", new Language("flämisch", "vls")));
            add(new Tag("dial.", new Attribute("dialektal")));
            add(new Tag("norw.", new Language("norwegisch", "nor")));
            add(new Tag("Norw.", new Language("Norwegian", "nor")));
            add(new Tag("part.", new Tempus("Partizip, praet.")));
            add(new Tag("pass.", new Attribute("passiv")));
            add(new Tag("perf.", new Tempus("Perfekt")));
            add(new Tag("pers.", new Attribute("Person")));
            add(new Tag("russ.", new Language("russisch", "rus")));
            //add(new Tag("südd.", new Language("süddeutsch")));
            add(new Tag("sbst.", new Attribute("Substantive")));
            add(new Tag("schw.", new Attribute("schwach")));
            add(new Tag("serb.", new Language("serbisch", "srp")));
            add(new Tag("Swed.", new Language("Swedish", "swe")));
            add(new Tag("plur.", new Numerus(Numerus.Type.PLURAL, "Plural")));
            add(new Tag("poet.", new Variant("poetisch")));
            add(new Tag("poss.", new Attribute("Possessiv")));
            add(new Tag("präf.", new Attribute("Präfix")));
            add(new Tag("präp.", new Attribute("Präposition")));

            add(new Tag("nsl.", new Language("nordslawisch", "slv")));
            add(new Tag("ptc.", new Attribute("Partizip")));
            add(new Tag("dim.", new Attribute("Diminutiv")));
            //add(new Tag("dor.", new Language("dorisch")));
            add(new Tag("eig.", new Reference("eigentlich")));
            add(new Tag("etw.", new Abbreviation("etwas")));
            add(new Tag("fem.", new Genus(Genus.Type.FEMININ, "feminin")));
            add(new Tag("gen.", new Attribute("Genitiv")));
            add(new Tag("got.", new Language("gotisch", "got")));
            add(new Tag("idg.", new Language("indogermanisch", "one")));
            //add(new Tag("ion.", new Language("ionisch")));
            add(new Tag("isl.", new Language("isländisch", "ice")));
            add(new Tag("jmd.", new Abbreviation("jemand")));
            add(new Tag("lat.", new Language("lateinisch", "lat")));
            add(new Tag("Lat.", new Language("Latin", "lat")));
            add(new Tag("lit.", new Language("litauisch", "lit")));
            add(new Tag("loc.", new Attribute("Lokativ")));
            add(new Tag("nom.", new Attribute("Nominativ")));
            add(new Tag("nhd.", new Language("neuhochdeutsch", "nhd")));
            add(new Tag("ndl.", new Language("niederländisch", "nld")));
            add(new Tag("nnd.", new Language("neuniederdeutsch", "nds")));
            add(new Tag("Dut.", new Language("Dutch", "dum")));
            add(new Tag("mhd.", new Language("Mittelhochdeutsch", "gmh")));
            add(new Tag("mnd.", new Language("Mittelniederdeutsch", "gml")));
            add(new Tag("MLG.", new Language("Middle Low German", "gml")));
            add(new Tag("MHG.", new Language("Middle High German", "gmh")));
            add(new Tag("rel.", new Abbreviation("relativ")));
            add(new Tag("asl.", new Language("altkirchenslawisch", "chu")));
            add(new Tag("acc.", new Attribute("Akkusativ")));
            add(new Tag("dän.", new Language("dänisch", "da")));
            add(new Tag("adv.", new Attribute("Adverb")));
            add(new Tag("afr.", new Language("altfranzösisch", "fro")));
            add(new Tag("ags.", new Language("Angelsächsisch", "ang")));
            add(new Tag("ahd.", new Language("Althochdeutsch", "goh")));
            add(new Tag("air.", new Language("altirisch", "sga")));
            add(new Tag("akk.", new Attribute("Akkusativ")));
            add(new Tag("red.", new Attribute("redupliziert")));
            add(new Tag("alb.", new Language("albanisch", "sqi")));
            add(new Tag("and.", new Language("altniederdeutsch", "nds")));
            add(new Tag("arm.", new Language("armenisch", "arm")));
            //add(new Tag("aor.", new Language("Aorist"))); ??
            add(new Tag("Bav.", new Language("Bavarian", "gem")));
            add(new Tag("bes.", new Abbreviation("besonders")));
            add(new Tag("dat.", new Attribute("dative")));
            add(new Tag("d.h.", new Abbreviation("das heißt")));
            add(new Tag("dän.", new Language("dänisch", "da")));
            add(new Tag("dan.", new Language("Danish", "da")));
            add(new Tag("dat.", new Attribute("Dativ")));
            add(new Tag("i.e.", new Examples("that is, namely")));
            add(new Tag("osk.", new Language("oskisch", "osc")));
            add(new Tag("z.B.", new Examples("zum Beispiel")));
            add(new Tag("sup.", new Attribute("Superlativ")));
            add(new Tag("skr.", new Language("sanskrit", "san")));
            add(new Tag("Skt.", new Language("Sanskrit", "san")));
            add(new Tag("etc.", new Abbreviation("et cetera")));
            add(new Tag("vgl.", new Reference("vergleiche")));

            add(new Tag("Gk.", new Language("Greek", "grc")));
            add(new Tag("gr.", new Language("Griechisch", "grc")));
            add(new Tag("ig.", new Language("indogermanisch", "ine")));
            add(new Tag("ir.", new Language("irisch", "gle")));
            add(new Tag("md.", new Language("mitteldeutsch", "gem")));
            add(new Tag("nd.", new Language("niederdeutsch", "nds")));
            add(new Tag("adj", new Attribute("Adjektiv")));
            add(new Tag("as.", new Language("altsächsisch", "nds")));
            add(new Tag("fl.", new Attribute("flektiert")));
            add(new Tag("sg.", new Numerus(Numerus.Type.SINGULAR, "Einzahl")));
            add(new Tag("st.", new Attribute("stark")));
            add(new Tag("vb.", new Attribute("verbum")));
            add(new Tag("cf.", new Attribute("compare")));
            add(new Tag("Wz.", new Reference("Wurzel")));
            add(new Tag("Av.", new Language("Avestan", "ave")));
            add(new Tag("an.", new Language("altnordisch", "non")));
            add(new Tag("pl.", new Numerus(Numerus.Type.PLURAL, "Plural")));

            add(new Tag("g.", new Attribute("Genitiv")));
            add(new Tag("ä.", new Abbreviation("ähnlich")));
            add(new Tag("a.", new Attribute("Adjektiv")));
            add(new Tag("c.", new Abbreviation("cum")));
            add(new Tag("d.", new Attribute("Dativ/deutsch/der")));
            add(new Tag("i.", new Abbreviation("in")));
            add(new Tag("m.", new Genus(Genus.Type.MASCULINE, "maskulin")));
            add(new Tag("s.", new Reference("siehe")));
            add(new Tag("v.", new Abbreviation("von")));
            add(new Tag("p.", new Abbreviation("Person")));
            add(new Tag("n.", new Genus(Genus.Type.NEUTRUM, "sächlich")));
            add(new Tag("f.", new Genus(Genus.Type.FEMININ, "feminin")));
        }
    };

    /**
     * Tries to match any abbreviations.
     * 
     * @param text
     * @return
     */
    public static ArrayList<Tag> findTags(final String text) {
        ArrayList<Tag> matches = new ArrayList<Tag>();
        String lowerCaseText = text.toLowerCase();

        for (Tag tag : tags) {
            if (tag.matches(lowerCaseText)) {
                matches.add(tag);

                // Remove first match to prevent multiple matches:
                // example: "v. o." then "v."
                // would double match wrong -> reason for map sorting.
                lowerCaseText = tag.removeAbbrevationFromText(lowerCaseText);
            }
        }

        return matches;
    }

    /**
     * Generates a key values pairs like (<abbreviation>,
     * <text-behind-that-abbr.>)
     * 
     * @param text
     * @return
     */
    public ArrayList<Match> parse() {
        final ArrayList<Tag> tags = findTags(text);
        final ArrayList<Match> foundTags = new ArrayList<Match>();

        final String lowerCase = text.toLowerCase();
        final int count = tags.size();

        for (int i = 0; i < count; i += 1) {
            Tag tag = tags.get(i);

            final int startIndex = lowerCase.indexOf(tag.token.toLowerCase()) + tag.token.length() + 1;
            int endIndex = lowerCase.length() - 1;
            String textWithoutAbbreviation = "";

            // Happens when abbreviation is the last token
            if (startIndex < endIndex) {
                textWithoutAbbreviation = lowerCase.substring(startIndex, endIndex);
            }

            String abbreviationText = "";

            if (textWithoutAbbreviation.length() > 0) {
                // Cut at the next white space when languages found, compound words will be cut off here
                String terminator = (tag.metaData instanceof Language) ? " " : ";";
                int separatorIndex = textWithoutAbbreviation.indexOf(terminator);
                
                if (separatorIndex == -1) {
                    separatorIndex = textWithoutAbbreviation.length() - 1;
                }
                abbreviationText = org.apache.commons.lang.StringUtils.strip(textWithoutAbbreviation.substring(0, separatorIndex), ", ");
            }

            foundTags.add(new Match(tag, abbreviationText));
        }
        return foundTags;
    }

    public static String findSubstring(String abbreviation, String text) {
        char[] terminators = { ';', ',', '\n', '\r' };
        return findSubstring(abbreviation, text, terminators);
    }

    /**
     * Start from the abbreviation, then move to left and right until you hit an
     * the "terminators", then return that substring
     * "bla bla; abbr. cla cla, dla dla" => "abbr. cla cla"
     * 
     * @param abbreviation
     * @param text
     * @param terminators
     * @return
     */
    public static String findSubstring(String abbreviation, String text, char[] terminators) {
        final int abbreviationIndex = text.toLowerCase().indexOf(abbreviation.toLowerCase());
        int i = abbreviationIndex;

        int startIndex = 0;
        int endIndex = text.length() - 1;

        // Look left
        while (i > 0) {
            i -= 1;

            for (int j = 0; j < terminators.length; j++) {
                if (text.charAt(i) == terminators[j]) {
                    startIndex = i + 1;
                    break;
                }
            }

        }

        i = abbreviationIndex;
        // Look right
        while (i < text.length() - 1) {
            i += 1;
            for (int j = 0; j < terminators.length; j++) {
                if (text.charAt(i) == terminators[j]) {
                    endIndex = i + 1;
                    break;
                }
            }

        }

        return text.substring(startIndex, endIndex).trim();
    }
}
