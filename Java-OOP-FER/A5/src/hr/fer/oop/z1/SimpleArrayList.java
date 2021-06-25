package hr.fer.oop.z1;

public class SimpleArrayList {
	private Object[] array = new Object[2];
	private int size=0;
	private int maxSize=2;
	public boolean add(Object o) {
		if(size>=maxSize){
			Object[] newArray=new Object[2*maxSize];
			for(int i=0;i<maxSize;i++) {
				newArray[i]=array[i];
			}
			array=newArray;
		}
		array[size]=o;
		size++;
		return true;
	}
	public int size() {
		return size;
	}
	public Object get(int index) {
		if(index>=0 && index<size) {
			return array[index];
		}else {
			return null;
		}
	}
	public int indexOf(Object o) {
		for(int i =0;i<size;i++) {
			if(o==array[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
