package z2;

public class Triple<T> {
	private T element1;
	private T element2;
	private T element3;

	public T getElement(int elementNumber) {
		switch (elementNumber) {
		case 1:
			return element1;
		case 2:
			return element2;
		case 3:
			return element3;
		default:
			throw new IllegalArgumentException();
		}
	}

	public void setElement(int elementNumber, Object element) {
		switch (elementNumber) {
		case 1:
			element1 = (T) element;
		case 2:
			element2 = (T) element;
		case 3:
			element3 = (T) element;
		default:
			throw new IllegalArgumentException();
		}
	}
	public Triple(T element1,T element2,T element3) {
		this.element1=element1;
		this.element2=element2;
		this.element3=element3;
	}
}
