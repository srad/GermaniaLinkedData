package de.unifrankfurt.informatik.linkedopendata.model;

public class Match<K, V> {
	public K key;
	public V value;

	public Match(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "(" + this.key + ", " + this.value + ")";
	}
}
