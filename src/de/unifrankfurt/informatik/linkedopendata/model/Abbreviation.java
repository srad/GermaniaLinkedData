package de.unifrankfurt.informatik.linkedopendata.model;

public class Abbreviation<M> {
	final public String abbreviation;
	final public M metaData;

	public Abbreviation(String key, M metaData) {
		this.abbreviation = key;
		this.metaData = metaData;
	}

	private String getRegEx() {
		return "^(\\s*\\S+\\s+|\\s+)*" + regexEscape(this.abbreviation);
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
		return text
				.replaceAll("\\s" + regexEscape(this.abbreviation), "")
				.replaceAll("^" + regexEscape(this.abbreviation), "");
	}

	@Override
	public String toString() {
		return "(\"" + this.abbreviation + "\", \"" + this.metaData + "\")";
	}
}