package collections.z8;

import java.util.*;

public class Polynomial {
	private Map<Integer,Integer> pol=new TreeMap<>();
	public Polynomial(int...elements) {
		for(int i=0;i<elements.length;i+=2) {
			pol.put(elements[i+1], elements[i]);
		}
	}
	@Override
	public String toString() {
		String result="";
		for(Map.Entry<Integer,Integer> entry:pol.entrySet()) {
			if(entry.getKey()==0) {
				
			}
		}
		return result;
	}
}
