package hashing.core;

public interface HashSerializer<T> {

	public byte[] serialize(T data);
	
}
