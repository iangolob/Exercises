package files;

import java.util.*;

public class StandingsUtil {
	public static List<Pair<String, Integer>> orderByPoints(Map<String, Integer> map){
		Map<Integer,Set<String>> sortedMap = new TreeMap<>();
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(sortedMap.get(entry.getValue())==null)
				sortedMap.put(entry.getValue(), new HashSet<>());
			sortedMap.get(entry.getValue()).add(entry.getKey());
		}
		
		List<Pair<String,Integer>> result = new LinkedList<>();
		for(Map.Entry<Integer, Set<String>> entry:sortedMap.entrySet()) {
			Set<String> set= entry.getValue();
			for(String country:set) {
				result.add(0, new Pair<>(country,entry.getKey()));
			}
		}
		return result;
	}
}
