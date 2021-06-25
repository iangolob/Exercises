package excersise11.z1;

import java.util.Iterator;


public class ImmutableContainerD implements Iterable<Integer> {
	private Integer[] numbers;

	public ImmutableContainerD(Integer... num) {
		numbers = new Integer[num.length];
		for (int i = 0; i < num.length; i++)
			getNumbers()[i] = num[i];
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<>(){
			int index=numbers.length-1;
			@Override
			public boolean hasNext() {
				return index >= 0;
			}
			@Override
			public Integer next() {		
				if(!hasNext())
					throw new IndexOutOfBoundsException();
				return getNumbers()[index--];
			}
		};
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
