package hashing.core;

public abstract class Resolver<K, V> {

	protected K[] keys;
	protected V[] values;
		
	protected HashFunction defaultHashFunction;
	
	public abstract boolean resolve(K key, V value);
	
	public abstract int resolveLookup(K key);
	
}
