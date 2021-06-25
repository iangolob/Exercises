package z3;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Iterator<Integer> iterator = new FactorialIterator(-1);
		while(iterator.hasNext())
		    System.out.println(iterator.next());
	}

}
