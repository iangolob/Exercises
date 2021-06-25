package collections.z2;

public class Pair<T> {
	public final T first;
	public final T second;
	public Pair(T element1,T element2) {
		this.first=element1;
		this.second=element2;
	}
	public T getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	
}
