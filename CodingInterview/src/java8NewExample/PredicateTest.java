package java8NewExample;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		/*
		 * Predicate<Integer> longest=i->(i>18); System.out.println(longest.test(10)); }
		 */
		
	
		Predicate<Integer> longest=(i)->
			(i>18);
			System.out.println(longest.test(19));
		
		

	}
}
