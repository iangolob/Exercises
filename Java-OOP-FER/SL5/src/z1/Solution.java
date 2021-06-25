package z1;

import java.util.HashSet;
import java.util.*;
import java.util.function.Predicate;

public class Solution {

	public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar) {
		String exString = Double.toString(exemplar);
		if (exString.indexOf('.') != 1)
			exString = exString.substring(exString.indexOf('.') - 1);
		final String s = exString;
		return (list) -> {
			for (List<Integer> pair : list) {
				int index;
				if(pair.get(0)==0) {
					index=0;
				}else {
					index=pair.get(0)+1;
				}
				if(index<s.length())
					if(pair.get(1)!=(s.charAt(index)-'0'))
					return false;
			}
			return true;
		};
	}

	public static Predicate<List<List<Integer>>> allDigitsDefined() {
		return (list) ->{
			Set<Integer> indexSet = new TreeSet<>();
			for(List<Integer> pair:list) {
				indexSet.add(pair.get(0));
			}
			int lastIndex=-1;
			for(int index:indexSet) {
				if(lastIndex!=-1)
					if(index!=lastIndex+1)
						return false;
				lastIndex=index;
			}
			return true;
		};
	}
}
