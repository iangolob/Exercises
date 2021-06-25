package z1;

public class ListElement<T extends Comparable<T>>{
	private T element;
	private ListElement<T> next=null;
	public ListElement(T element){
		this.element=element;
	}
	
	public T getElement() {
		return element;
	}
	public void setNext(ListElement<T> next) {
		this.next=next;
	}
	public ListElement<T> getNext(){
		return next;
	}
}
