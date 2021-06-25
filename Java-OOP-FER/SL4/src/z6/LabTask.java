package z6;

import java.util.Map;
import java.util.Set;

public class LabTask {
	public static int count(Map<Integer, Integer> map, Set<Integer> set) {
		int count=0;
		for(Integer i:set) {
			if(map.values().contains(i))
				count++;
		}
		return count;
	}
}
