package generics.z2;

public class KeyValueParameterized<K,V> {
	private K key;
	private V value;
	public KeyValueParameterized(K key, V value) {
		this.key=key;
		this.value=value;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		return key+" - "+value;
	}
	
}
