package generics.z5;

import generics.z2.KeyValueParameterized;

public class Main {
	public static <K extends Number,T> double calculateAverageKey(KeyValueParameterized<K,T>... map) {
		double result=0;
		for(KeyValueParameterized<K,T> elem:map) {
			result=result + elem.getKey().doubleValue();
		}
		
		
		
		if(map.length!=0) {
			result=result/map.length;
		}
		return result;
	}
}
