package z3;

import java.util.*;

public class FactorialIterator implements Iterator<Integer> {
	private int numOfNumbers;
	private int current = 0;
	private int currentIndex = 0;

	public FactorialIterator(int numOfNumbers) {
		if(numOfNumbers<0)
			throw new IllegalArgumentException();
		this.numOfNumbers = numOfNumbers;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < numOfNumbers;
	}

	@Override
	public Integer next() {
		if(!hasNext())
			throw new NoSuchElementException();
		if (currentIndex == 0) {
			current = 1;
		} else {
			current = current * currentIndex;
		}
		currentIndex++;
		return current;
	}

}
