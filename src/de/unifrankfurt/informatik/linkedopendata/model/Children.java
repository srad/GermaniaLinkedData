package de.unifrankfurt.informatik.linkedopendata.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Children extends ArrayList<Entry> {
	private static final long serialVersionUID = -6341329712115692882L;

	@Override
	public String toString() {
		String s = "";

		for (Iterator<Entry> iterator = this.iterator(); iterator.hasNext();) {
			Entry entry = (Entry) iterator.next();
			s += entry.id + ",";
		}

		return "[" + s + "]";
	}
}