package de.unifrankfurt.informatik.linkedopendata.model;

import org.apache.commons.lang.StringEscapeUtils;

import com.hp.hpl.jena.sparql.util.StringUtils;

public class Entry {

	public String htmlId;
	public String id;
	public String lemma;
	public String parentId;
	public String greece;
	public String oldEnglish;
	public String description;
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

	public void setLatin(final String latin) {
		// Remove prefix "... lat."
		this.latin = latin.replaceFirst("lat.", "").replaceFirst(".", "")
				.replaceFirst("-", "").trim();
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

}
