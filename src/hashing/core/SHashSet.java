package hashing.core;

public interface SHashSet<T> {

	/**
	 * Put if present.
	 * 
	 * @param key
	 * @param value
	 * @return true if successful
	 */
	public boolean add(T key);

	public boolean contains(T key);

	/**
	 * Deletes if present.
	 * 
	 * @param key
	 * @return true if was present
	 */
	public boolean delete(T key);
}
