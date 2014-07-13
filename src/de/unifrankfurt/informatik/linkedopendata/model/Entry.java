package de.unifrankfurt.informatik.linkedopendata.model;

public class Entry {

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

	public void setId(String id) {
		this.id = formatId(id);
	}

	public void setLatin(String latin) {
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
	private String formatId(String id) {
		return id.replaceFirst("b[0]+", "");
	}

	public void setParentId(String parentId) {
		if (parentId.trim().equals("")) {
			this.parentId = null;
		} else {
			this.parentId = parentId;
		}
	}

}
