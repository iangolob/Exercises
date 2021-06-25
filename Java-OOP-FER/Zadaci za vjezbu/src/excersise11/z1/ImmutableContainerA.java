package excersise11.z1;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class ImmutableContainerA implements Iterable<Integer> {
	private Integer[] numbers;

	public ImmutableContainerA(Integer... num) {
		numbers = new Integer[num.length];
		for (int i = 0; i < num.length; i++)
			numbers[i] = num[i];
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ImmutableContainerIteratorA(this);
	}
	private static class ImmutableContainerIteratorA implements Iterator<Integer> {
		int index;
		ImmutableContainerA container;
		public ImmutableContainerIteratorA(ImmutableContainerA container) {
			this.container=container;
			index=container.numbers.length-1;
		}
		@Override
		public boolean hasNext() {
			return index >=0;
		}
		@Override
		public Integer next() {		
			if(!hasNext())
				throw new NoSuchElementException();
			int elem = container.numbers[index];
			index-=2;
			return elem;
		}
	}
}