package de.unifrankfurt.informatik.linkedopendata.model;

import java.util.HashMap;

import org.apache.commons.lang.StringEscapeUtils;

public class Entry {

	public enum abbreviationType {
		ABBREVIATION, RAWTEXT
	};

	public String htmlId;
	public String id;
	public String lemma;
	public String parentId;
	public String greece;
	public String oldEnglish;
	public String description;
	public HashMap<abbreviationType, Abbreviation<String>> descriptionMetaData = new HashMap<abbreviationType, Abbreviation<String>>();
	public String latin;
	public Children children = new Children();

	@Override
	public String toString() {
		return "id: " + this.id + ", children: " + children + ", parent-id: "
				+ this.parentId + ", Lemma: " + lemma + ", Greece: " + greece
				+ ", Old English: " + oldEnglish + ", Latin: " + latin
				+ ", Description: " + description;
	}

	public void setId(final String id) {
		this.id = formatId(id);
		this.htmlId = StringEscapeUtils.escapeHtml(this.id);
	}

	/**
	 * The ids in parent="..." differ from id="..." although they are the same.
	 * This setter normalizes them.
	 * 
	 * @param id
	 * @return
	 */
	private String formatId(final String id) {
		return id.replaceFirst("b[0]+", "");
	}

	public void setParentId(final String parentId) {
		if (parentId.trim().equals("")) {
			this.parentId = null;
		} else {
			this.parentId = parentId;
		}
	}

	public void setDescription(final String text) {
		HashMap<String, String> foundAbbreviations = new Abbreviations(text).parse();

		if (foundAbbreviations.size() == 0) {
			this.descriptionMetaData.put(abbreviationType.RAWTEXT, new Abbreviation<String>("raw", text));
		} else {
			for (java.util.Map.Entry<String, String> entry : foundAbbreviations.entrySet()) {
				this.descriptionMetaData.put(abbreviationType.ABBREVIATION, new Abbreviation<String>(entry.getKey(), entry.getValue()));
			}
		}

		// From 0 to ";|\n" is the main description
		int separatorIndex = text.indexOf(";");
		if (separatorIndex == -1) {
			separatorIndex = text.length() - 1;
		}
		this.description = text.substring(0, separatorIndex);
	}
}
