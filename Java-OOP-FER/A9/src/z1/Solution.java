package z1;

import java.util.*;

public class Solution {
	public static List<List<String>> groupAnagrams(String[] inp){
		
		Map<Map<Character,Integer>,List<String>> mainMap = new TreeMap<>(); 
		for(String s:inp) {
			Map<Character,Integer> sMap=new TreeMap<>();
			for(int i=0;i<s.length();i++) {
				sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			}
			mainMap.put(sMap, mainMap.getOrDefault(mainMap.get(sMap), new LinkedList<>()));
			mainMap.get(sMap).add(s);
		}
		List<List<String>> result = new LinkedList<>();
		for(Map<Character,Integer> m:mainMap.keySet()) {
			result.add(mainMap.get(m));
		}
		return result;
	}
}
