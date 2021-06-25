package z1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		 List<List<String>> result = Solution.groupAnagrams(input);
		 for(List<String> group: result) {
		 System.out.println(group);
		 }
	}

}
