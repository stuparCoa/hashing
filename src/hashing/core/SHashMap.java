package hashing.core;


public interface SHashMap<K, V> {

	public V get(K key);

	/**
	 * Put if present.
	 * 
	 * @param key
	 * @param value
	 * @return true if successful
	 */
	public boolean put(K key, V value);

	public boolean contains(K key);

	/**
	 * Deletes if present.
	 * 
	 * @param key
	 * @return true if was present
	 */
	public boolean delete(K key);

	public K[] keys();

	public V[] values();

	public SHashSet<K> keySet();

	public SHashSet<V> valueSet();
}
