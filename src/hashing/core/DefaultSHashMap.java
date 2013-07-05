package hashing.core;


public class DefaultSHashMap<K, V> implements SHashMap<K, V> {

	protected long[] hashes;
	protected K[] keys;
	protected V[] values;
	
	protected Resolver<K, V> collisionResolver;
	protected HashFunction defaultHashFunction;
	protected HashSerializer<K> serializer;
	
	public DefaultSHashMap(){
		
	}
	
	public DefaultSHashMap(int initialSize){
		//TODO: check array initialization.
	}
	
	@Override
	public boolean contains(K key) {
		
		return false;
	}

	@Override
	public boolean delete(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SHashSet<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K[] keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean put(K key, V value) {
		int index = defaultHashFunction.hash32(serializer.serialize(key));
		if(keys[index]!=null){
			return collisionResolver.resolve(key, value);			
		}
		keys[index]=key;
		values[index]=value;
		return true;
	}

	@Override
	public SHashSet<V> valueSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V[] values() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
