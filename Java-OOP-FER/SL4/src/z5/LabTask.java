package z5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LabTask {
    public static Map<Integer, Set<String>> underpayed(Map<String, Map<Integer, List<Integer>>> salaries) {
       Set<Integer> yearSet = new HashSet<>();
       for(String id:salaries.keySet()) {
    	   for(Integer year:salaries.get(id).keySet())
    		   yearSet.add(year);
       }
       
       
       
       Map<Integer,Set<String>> underpaid = new HashMap<>();
       
       
       
       for(int year:yearSet) {
    	   underpaid.put(year, new HashSet<>());
    	   Map<String,Double> averageSalarySet = new HashMap<>();
    	   double totalAverageSalary=0;
    	   int numOfPeople=0;
    	   for(String id:salaries.keySet()) {
    		   if(salaries.get(id).containsKey(year)) {
    			   double averageSalary=0;
    			   for(Integer i: salaries.get(id).get(year))
    				   averageSalary+=i;
    			   averageSalary=averageSalary/12;
    			   totalAverageSalary+=averageSalary;
    			   numOfPeople++;
    			   averageSalarySet.put(id, averageSalary);
    		   }
    	   }
    	   totalAverageSalary=totalAverageSalary/numOfPeople;
    	   for(String id:averageSalarySet.keySet()){
    		   if(averageSalarySet.get(id)<totalAverageSalary*0.7)
    			   underpaid.get(year).add(id);
    	   }
       }   
       return underpaid;
    }
}