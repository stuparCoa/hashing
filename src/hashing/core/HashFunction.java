package hashing.core;

import java.util.ArrayList;

public interface HashFunction {

	public long hash64(byte[] data);
	
	public int hash32(byte[] data);
	
	public byte[] hash(byte[] data, int size);
	
	public ArrayList<String> properties();
	
}
