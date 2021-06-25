package z4;

public class KeyValue<TK,TV> {
	private TK key;
	private TV value;
	public KeyValue(TK key,TV value) {
		this.key=key;
		this.value=value;
	}
	public TK getKey() {
		return key;
	}
	public void setKey(TK key) {
		this.key = key;
	}
	public TV getValue() {
		return value;
	}
	public void setValue(TV value) {
		this.value = value;
	}
	
}
