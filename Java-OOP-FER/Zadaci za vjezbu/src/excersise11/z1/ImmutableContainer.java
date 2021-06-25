package excersise11.z1;

import java.util.Iterator;

public class ImmutableContainer implements Iterable<Integer> {
	private Integer[] numbers;

	public ImmutableContainer(Integer... num) {
		numbers = new Integer[num.length];
		for (int i = 0; i < num.length; i++)
			getNumbers()[i] = num[i];
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ImmutableContainerIterator();
	}
	public Integer[] getNumbers() {
		return numbers;
	}
	private class ImmutableContainerIterator implements Iterator<Integer> {
		int index=0;
		@Override
		public boolean hasNext() {
			return index < getNumbers().length;
		}
		@Override
		public Integer next() {		
			if(!hasNext())
				throw new IndexOutOfBoundsException();
			return getNumbers()[index++];
		}
	}
}
