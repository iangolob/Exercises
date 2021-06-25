package excersise11.z1;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ImmutableContainerB implements Iterable<Integer> {
	private Integer[] numbers;

	public ImmutableContainerB(Integer... num) {
		numbers = new Integer[num.length];
		for (int i = 0; i < num.length; i++)
			getNumbers()[i] = num[i];
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ImmutableContainerIteratorB();
	}
	public Integer[] getNumbers() {
		return numbers;
	}
	private class ImmutableContainerIteratorB implements Iterator<Integer> {
		private int index=0;
		@Override
		public boolean hasNext() {
			return index < numbers.length;
		}
		@Override
		public Integer next() {		
			if(!hasNext())
				throw new NoSuchElementException();
			return numbers[index++];
		}
	}
}
