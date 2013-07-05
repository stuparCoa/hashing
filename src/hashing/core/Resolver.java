package hashing.core;

public interface Resolver<K, V> {

	public boolean resolve(K[] keys, V[] values, K key, V value);
	
	public int resolveLookup(K[] keys, V[] values, K key);
	
}
