package de.unifrankfurt.informatik.linkedopendata.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Abbreviations {

	final String text;

	public Abbreviations(String text) {
		this.text = text;
	}

	/**
	 * Ordered by parser look ahead priority descending, don't move the order or
	 * the groups.
	 */
	@SuppressWarnings("serial")
	private final static ArrayList<Abbreviation<String>> map = new ArrayList<Abbreviation<String>>() {
		{
			add(new Abbreviation<String>("nordfries.", "nordfriesisch"));
			add(new Abbreviation<String>("ursprüngl.", "ursprünglich"));

			add(new Abbreviation<String>("mundartl.", "mundartlich"));
			add(new Abbreviation<String>("ostfries.", "ostfriesisch"));
			add(new Abbreviation<String>("altfries.", "altfriesisch"));
			add(new Abbreviation<String>("westgerm.", "westgermanisch"));
			add(new Abbreviation<String>("westfläm.", "westflämisch"));

			add(new Abbreviation<String>("neunorw.", "neunorwegisch"));
			add(new Abbreviation<String>("Grundwz.", "Grundwurzel"));
			add(new Abbreviation<String>("praepos.", "Präposition"));
			add(new Abbreviation<String>("Nebenwz.", "Nebenwurzel"));
			add(new Abbreviation<String>("neupers.", "neupersisch"));
			add(new Abbreviation<String>("ModNorw.", "Modern Norwegian"));
			add(new Abbreviation<String>("nschwed.", "neuschwedisch"));
			add(new Abbreviation<String>("schweiz.", "schweizerdeutsch"));
			add(new Abbreviation<String>("aschwed.", "altschwedisch"));
			add(new Abbreviation<String>("eigentl.", "eigentlich"));
			add(new Abbreviation<String>("spätmhd.", "spätmittelhochdeutsch"));
			add(new Abbreviation<String>("westfäl.", "westfälisch"));

			add(new Abbreviation<String>("nfries.", "neufriesisch"));
			add(new Abbreviation<String>("m.engl.", "Mittelenglisch"));
			add(new Abbreviation<String>("neuisl.", "neuisländisch"));
			add(new Abbreviation<String>("ofries.", "ostfriesisch"));
			add(new Abbreviation<String>("preuss.", "Preussisch"));
			add(new Abbreviation<String>("redupl.", "redupliziert"));
			add(new Abbreviation<String>("präpos.", "Präposition"));
			add(new Abbreviation<String>("german.", "germanisch"));
			add(new Abbreviation<String>("griech.", "Griechisch"));
			add(new Abbreviation<String>("Hesych.", "Hesychios"));
			add(new Abbreviation<String>("intens.", "Intensivum"));
			add(new Abbreviation<String>("klruss.", "kleinrussisch"));
			add(new Abbreviation<String>("langob.", "langobardisch"));
			add(new Abbreviation<String>("schwäb.", "schwäbisch"));
			add(new Abbreviation<String>("schwed.", "schwedisch"));
			add(new Abbreviation<String>("superl.", "Superlativ"));
			add(new Abbreviation<String>("unpers.", "unpersönlich"));
			add(new Abbreviation<String>("u. dgl.", "und dergleichen"));
			add(new Abbreviation<String>("wfries.", "westfriesisch"));
			add(new Abbreviation<String>("altlat.", "altlateinisch"));
			add(new Abbreviation<String>("afries.", "altfriesisch"));
			add(new Abbreviation<String>("afränk.", "altfränkisch"));
			add(new Abbreviation<String>("causat.", "Kausativ"));
			add(new Abbreviation<String>("compar.", "Komparativ"));
			add(new Abbreviation<String>("dissim.", "dissimilierend"));

			add(new Abbreviation<String>("ModHG.", "Modern High German"));
			add(new Abbreviation<String>("nslav.", "nordslawisch"));
			add(new Abbreviation<String>("nslov.", "neuslowenisch"));
			add(new Abbreviation<String>("oberd.", "oberdeutsch"));
			add(new Abbreviation<String>("partc.", "Partizip"));
			add(new Abbreviation<String>("praef.", "Präfix"));
			add(new Abbreviation<String>("praep.", "Präposition"));
			add(new Abbreviation<String>("praes.", "Präsens"));
			add(new Abbreviation<String>("praet.", "Präteritum"));
			add(new Abbreviation<String>("preuß.", "Preussisch"));
			add(new Abbreviation<String>("Pruss.", "Prussian"));
			add(new Abbreviation<String>("Pruss.", "Prussian"));
			add(new Abbreviation<String>("subst.", "Substantive"));
			add(new Abbreviation<String>("tirol.", "tirolerisch"));
			add(new Abbreviation<String>("trans.", "transitiv"));
			add(new Abbreviation<String>("u.s.w.", "und so weiter"));
			add(new Abbreviation<String>("urspr.", "ursprünglich"));
			add(new Abbreviation<String>("vergl.", "vergleiche"));
			add(new Abbreviation<String>("neutr.", "sächlich"));
			add(new Abbreviation<String>("altir.", "altirisch"));
			add(new Abbreviation<String>("OIcel.",
					"Old Norse (i.e. Old Icelandic)"));
			add(new Abbreviation<String>("acymr.", "altcymrisch"));
			add(new Abbreviation<String>("apers.", "altpersisch"));
			add(new Abbreviation<String>("aschw.", "altschwedisch"));
			add(new Abbreviation<String>("OSlav.", "Old Slavic"));
			add(new Abbreviation<String>("denom.", "denominal"));
			add(new Abbreviation<String>("dimin.", "Diminutiv"));
			add(new Abbreviation<String>("eigtl.", "eigentlich"));
			add(new Abbreviation<String>("fries.", "friesisch"));
			add(new Abbreviation<String>("instr.", "Instrumental"));
			add(new Abbreviation<String>("mengl.", "Mittelenglisch"));

			add(new Abbreviation<String>("zend.", "zendisch"));
			add(new Abbreviation<String>("nnorw", "Neunorwegisch"));
			add(new Abbreviation<String>("mndl.", "Mittelniederländisch"));
			add(new Abbreviation<String>("mlat.", "mittellatenisch"));
			add(new Abbreviation<String>("nndl.", "neuniederländisch"));
			add(new Abbreviation<String>("Nord.", "nordisch"));
			add(new Abbreviation<String>("o. ä.", "oder ähnliches"));
			add(new Abbreviation<String>("pron.", "Pronomen"));
			add(new Abbreviation<String>("umbr.", "umbrisch"));
			add(new Abbreviation<String>("WGmc.", "West Germanic"));
			add(new Abbreviation<String>("u. a.", "unter anderem"));
			add(new Abbreviation<String>("v. o.", "von oben"));
			add(new Abbreviation<String>("v. u.", "von unten"));
			add(new Abbreviation<String>("e. g.", "for example"));
			add(new Abbreviation<String>("refl.", "reflexiv"));
			add(new Abbreviation<String>("d. i.", "das ist"));
			add(new Abbreviation<String>("engl.", "englisch"));
			add(new Abbreviation<String>("ModE.", "English"));
			add(new Abbreviation<String>("finn.", "finnisch"));
			add(new Abbreviation<String>("Goth.", "Gothic"));
			add(new Abbreviation<String>("gael.", "gaelisch"));
			add(new Abbreviation<String>("gall.", "altgall."));
			add(new Abbreviation<String>("germ.", "germanisch"));
			add(new Abbreviation<String>("Goth.", "Gothic"));
			add(new Abbreviation<String>("hess.", "hessisch"));
			add(new Abbreviation<String>("intr.", "intransitiv"));
			add(new Abbreviation<String>("kelt.", "keltisch"));
			add(new Abbreviation<String>("kret.", "kretisch"));
			add(new Abbreviation<String>("lett.", "lettisch"));
			add(new Abbreviation<String>("Latv.", "Latvian,"));
			add(new Abbreviation<String>("Lith.", "Lithuanian"));
			add(new Abbreviation<String>("prät.", "Präteritum"));
			add(new Abbreviation<String>("MDut.", "Middle Dutch"));
			add(new Abbreviation<String>("adän.", "altdänisch"));
			add(new Abbreviation<String>("aeol.", "aeolisch"));
			add(new Abbreviation<String>("angl.", "anglisch"));
			add(new Abbreviation<String>("amhd.", "alt-"));
			add(new Abbreviation<String>("bair.", "bairisch"));
			add(new Abbreviation<String>("bulg.", "bulgarisch"));
			add(new Abbreviation<String>("caus.", "Kausativ"));
			add(new Abbreviation<String>("comp.", "Komparativ"));
			add(new Abbreviation<String>("conj.", "Konjunktion"));
			add(new Abbreviation<String>("cymr.", "cymrisch"));
			add(new Abbreviation<String>("dass.", "dasselbe"));
			add(new Abbreviation<String>("fläm.", "flämisch"));
			add(new Abbreviation<String>("dial.", "dialektal"));
			add(new Abbreviation<String>("norw.", "norwegisch"));
			add(new Abbreviation<String>("Norw.", "Norwegian"));
			add(new Abbreviation<String>("part.", "Partizip, praet."));
			add(new Abbreviation<String>("pass.", "passiv"));
			add(new Abbreviation<String>("perf.", "Perfekt"));
			add(new Abbreviation<String>("pers.", "Person"));
			add(new Abbreviation<String>("russ.", "russisch"));
			add(new Abbreviation<String>("südd.", "süddeutsch"));
			add(new Abbreviation<String>("sbst.", "Substantive"));
			add(new Abbreviation<String>("schw.", "schwach"));
			add(new Abbreviation<String>("serb.", "serbisch"));
			add(new Abbreviation<String>("Swed.", "Swedish"));
			add(new Abbreviation<String>("plur.", "Plural"));
			add(new Abbreviation<String>("poet.", "poetisch"));
			add(new Abbreviation<String>("poss.", "Possessiv"));
			add(new Abbreviation<String>("präf.", "Präfix"));
			add(new Abbreviation<String>("präp.", "Präposition"));

			add(new Abbreviation<String>("nsl.", "nordslawisch"));
			add(new Abbreviation<String>("ptc.", "Partizip"));
			add(new Abbreviation<String>("dim.", "Diminutiv"));
			add(new Abbreviation<String>("dor.", "dorisch"));
			add(new Abbreviation<String>("eig.", "eigentlich"));
			add(new Abbreviation<String>("etw.", "etwas"));
			add(new Abbreviation<String>("fem.", "feminin"));
			add(new Abbreviation<String>("gen.", "genitive"));
			add(new Abbreviation<String>("gen.", "Genitiv"));
			add(new Abbreviation<String>("got.", "gotisch"));
			add(new Abbreviation<String>("idg.", "indogermanisch"));
			add(new Abbreviation<String>("ion.", "ionisch"));
			add(new Abbreviation<String>("isl.", "isländisch"));
			add(new Abbreviation<String>("jmd.", "jemand"));
			add(new Abbreviation<String>("lat.", "lateinisch"));
			add(new Abbreviation<String>("Lat.", "Latin"));
			add(new Abbreviation<String>("lit.", "litauisch"));
			add(new Abbreviation<String>("loc.", "Lokativ"));
			add(new Abbreviation<String>("nom.", "Nominativ"));
			add(new Abbreviation<String>("nhd.", "neuhochdeutsch"));
			add(new Abbreviation<String>("ndl.", "niederländisch"));
			add(new Abbreviation<String>("nnd.", "neuniederdeutsch"));
			add(new Abbreviation<String>("Dut.", "Dutch"));
			add(new Abbreviation<String>("mhd.", "Mittelhochdeutsch"));
			add(new Abbreviation<String>("mnd.", "Mittelniederdeutsch"));
			add(new Abbreviation<String>("MLG.", "Middle Low German"));
			add(new Abbreviation<String>("MHG.", "Middle High German"));
			add(new Abbreviation<String>("rel.", "relativ"));
			add(new Abbreviation<String>("asl.", "altkirchenslawisch"));
			add(new Abbreviation<String>("acc.", "Akkusativ"));
			add(new Abbreviation<String>("dän.", "dänisch"));
			add(new Abbreviation<String>("adv.", "Adverb"));
			add(new Abbreviation<String>("afr.", "altfranzösisch"));
			add(new Abbreviation<String>("ags.", "Angelsächsisch"));
			add(new Abbreviation<String>("ahd.", "Althochdeutsch"));
			add(new Abbreviation<String>("air.", "altirisch"));
			add(new Abbreviation<String>("akk.", "Akkusativ"));
			add(new Abbreviation<String>("red.", "redupliziert"));
			add(new Abbreviation<String>("alb.", "albanisch"));
			add(new Abbreviation<String>("and.", "altniederdeutsch"));
			add(new Abbreviation<String>("arm.", "armenisch"));
			add(new Abbreviation<String>("aor.", "Aorist"));
			add(new Abbreviation<String>("Bav.", "Bavarian"));
			add(new Abbreviation<String>("bes.", "besonders"));
			add(new Abbreviation<String>("dat.", "dative"));
			add(new Abbreviation<String>("d.h.", "das heißt"));
			add(new Abbreviation<String>("dän.", "dänisch"));
			add(new Abbreviation<String>("dan.", "Danish"));
			add(new Abbreviation<String>("dat.", "Dativ"));
			add(new Abbreviation<String>("i.e.", "that is, namely"));
			add(new Abbreviation<String>("osk.", "oskisch"));
			add(new Abbreviation<String>("z.B.", "zum"));
			add(new Abbreviation<String>("sup.", "Superlativ"));
			add(new Abbreviation<String>("skr.", "sanskrit"));
			add(new Abbreviation<String>("Skt.", "Sanskrit"));
			add(new Abbreviation<String>("etc.", "et cetera"));
			add(new Abbreviation<String>("vgl.", "vergleiche"));

			add(new Abbreviation<String>("Gk.", "Greek"));
			add(new Abbreviation<String>("gr.", "Griechisch"));
			add(new Abbreviation<String>("ig.", "indogermanisch"));
			add(new Abbreviation<String>("ir.", "irisch"));
			add(new Abbreviation<String>("md.", "mitteldeutsch"));
			add(new Abbreviation<String>("nd.", "niederdeutsch"));
			add(new Abbreviation<String>("adj", "Adjektiv"));
			add(new Abbreviation<String>("as.", "altsächsisch"));
			add(new Abbreviation<String>("fl.", "flektiert"));
			add(new Abbreviation<String>("sg.", "Einzahl"));
			add(new Abbreviation<String>("st.", "stark"));
			add(new Abbreviation<String>("vb.", "verbum"));
			add(new Abbreviation<String>("cf.", "compare"));
			add(new Abbreviation<String>("Wz.", "Wurzel"));
			add(new Abbreviation<String>("Av.", "Avestan"));
			add(new Abbreviation<String>("an.", "altnordisch"));
			add(new Abbreviation<String>("pl.", "Plural"));

			add(new Abbreviation<String>("g.", "Genitiv"));
			add(new Abbreviation<String>("ä.", "ähnlich"));
			add(new Abbreviation<String>("a.", "Adjektiv"));
			add(new Abbreviation<String>("c.", "cum"));
			add(new Abbreviation<String>("d.", "Dativ, deutsch, der"));
			add(new Abbreviation<String>("i.", "in"));
			add(new Abbreviation<String>("m.", "maskulin"));
			add(new Abbreviation<String>("s.", "siehe"));
			add(new Abbreviation<String>("v.", "von"));
			add(new Abbreviation<String>("p.", "Person"));
			add(new Abbreviation<String>("n.", "sächlich"));
			add(new Abbreviation<String>("f.", "feminin"));
		}
	};

	/**
	 * Tries to match any abbreviations.
	 * 
	 * @param text
	 * @return
	 */
	public static ArrayList<Abbreviation<String>> findMatches(final String text) {
		ArrayList<Abbreviation<String>> matches = new ArrayList<Abbreviation<String>>();
		String lowerCase = text.toLowerCase();

		for (Abbreviation<String> abbr : map) {
			String key = abbr.abbreviation.toLowerCase();
			Abbreviation<String> abbrevation = new Abbreviation<String>(key, abbr.metaData);

			if (abbrevation.matches(lowerCase)) {
				matches.add(abbrevation);

				// Remove first match to prevent multiple matches:
				// example: "v. o." then "v."
				// would double match wrong -> reason for map sorting.
				lowerCase = abbrevation.removeAbbrevationFromText(lowerCase);
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
	public HashMap<String, String> parse() {
		System.err.println("--------------------------------------------");
		System.err.println(this.text);
		final ArrayList<Abbreviation<String>> abbreviations = findMatches(text);
		final HashMap<String, String> resultKV = new HashMap<String, String>();
		final String lowerCase = text.toLowerCase();
		final int count = abbreviations.size();

		for (int i = 0; i < count; i += 1) {
			Abbreviation<String> match = abbreviations.get(i);
			System.err.println(match.abbreviation + "::::::::::::::::");

			final int startIndex = lowerCase.indexOf(match.abbreviation.toLowerCase()) + match.abbreviation.length();
			int endIndex = lowerCase.length() - 1;
			String textWithoutAbbreviation = "";
			
			// Happens when abbreviation is the last token
			if (startIndex < endIndex) {
				textWithoutAbbreviation = lowerCase.substring(startIndex, endIndex);
			}
			
			String abbrevationText = "";
			
			if (textWithoutAbbreviation.length() > 0) {
				int separatorIndex = textWithoutAbbreviation.indexOf(";");
				if (separatorIndex == -1) {
					separatorIndex = textWithoutAbbreviation.length() - 1;
				}
				abbrevationText = textWithoutAbbreviation.substring(0, separatorIndex);
			}
			
			resultKV.put(match.abbreviation, abbrevationText);
		}
		System.err.println(resultKV);

		return resultKV;
	}
}
