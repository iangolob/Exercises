package z7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution implements StudentScoreStatistics{
	private Map<String,List<Integer>> mainMap = new LinkedHashMap<>();
	@Override
	public void addStudentScores(String student, Integer... scores) {
		//if(!mainMap.containsKey(student))
			mainMap.put(student, new LinkedList<>());
		for(Integer i: scores) {
			mainMap.get(student).add(i);
		}
		Collections.sort(mainMap.get(student));
	}

	@Override
	public Collection<String> getInsertionOrderedStudents() {
	//	if(mainMap.isEmpty())
		//	return null;
		return mainMap.keySet();
	}

	@Override
	public Collection<Integer> getNaturallySortedPointsForStudent(String student) {
		if(!mainMap.containsKey(student))
			return null;
		return mainMap.get(student);
	}

}
