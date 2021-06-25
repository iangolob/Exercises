package z1;

public class MyList<T extends Comparable<T>> {
	private ListElement<T> head = null;
	private int size = 0;

	public int addLast(T item) {
		ListElement<T> element = new ListElement<T>(item);
		if (head == null) {
			head = element;
		} else {
			ListElement<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(element);
		}
		size++;
		return size - 1;
	}

	public void removeAt(int index) {
		if(index>=size) return;
		if(index==0) head=head.getNext();
		
		ListElement<T> current=head;
		for(int i=0;i<index-1;i++) {
			current=current.getNext();
		}
		
		if(index==size) {
			current.setNext(null);
		}else {
			current.setNext(current.getNext().getNext());
		}
		size--;
	}
	public T elementAt(int index) {
		if(index>=size) return null;
		
		ListElement<T> current=head;
		for(int i=0;i<index;i++) {
			current=current.getNext();
		}
		
		return current.getElement();
	}
	
	public int size() {
		return size;
	}
	public void print() {
		ListElement<T> current=head;
		for(int i=0;i<size;i++) {
			System.out.println(current.getElement());
			current=current.getNext();
		}
	}
}
