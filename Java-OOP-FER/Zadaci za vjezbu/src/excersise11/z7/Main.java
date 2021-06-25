package excersise11.z7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println(charactersFrequency("mutava"));
	}

	public static Map<String, Integer> wordCount(List<String> words, String... lookingFor) {
		Map<String, Integer> count = new HashMap<>();
		Set<String> lookingForSet = Set.of(lookingFor);
		for (String word : words) {
			if (lookingForSet.contains(word)) {
				count.computeIfAbsent(word, (w) -> 0);
				count.computeIfPresent(word, (w, i) -> i+1);
			}
		}
		return count;
	}

	public static Map<Character, Integer> charactersFrequency(String str) {
		str.toCharArray();
		Map<Character, Integer> count = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			count.computeIfAbsent(c,(ch) -> 0);
			count.computeIfPresent(c, (ch,in) -> in+1);
		}
		return count;
	}
}
