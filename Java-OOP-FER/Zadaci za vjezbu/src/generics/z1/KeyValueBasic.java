package generics.z1;

public class KeyValueBasic {
	private int key;
	private String value;
	public KeyValueBasic(int key, String value) {
		this.key=key;
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		return key+" - "+value;
	}
	
	
}
