package z1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<List<Integer>> ulaz1= Arrays.asList(Arrays.asList(1,2),Arrays.asList(0,3),Arrays.asList(2,6)); // 3.26

		boolean t1 = Solution.allDigitsMatch(3.266).test(ulaz1); // true
		boolean t2 = Solution.allDigitsDefined().test(ulaz1); // true
		
		System.out.println(t1);
		System.out.println(t2);
		List<List<Integer>> ulaz2=Arrays.asList(Arrays.asList(1,2),Arrays.asList(0,3),Arrays.asList(4,6)); // 3.2**6
		boolean t3 = Solution.allDigitsMatch(3.266).test(ulaz2); // true
		boolean t4 = Solution.allDigitsDefined().test(ulaz2); // false
		System.out.println(t3);
		System.out.println(t4);
	}

}
