package StringExample;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
	public static void main(String[] args) {
		String[] strArray = { "hibernate", "Ravikiran", "java", "python", "microservices" };
//		String longestString = Arrays.stream(strArray)
//				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
//		System.out.println("longest String :" + longestString);
//		String shortString = Arrays.stream(strArray).reduce((a, b) -> a.length() < b.length() ? a : b).get();
//		System.out.println("shortString :" + shortString);

		Arrays.stream(strArray).sorted((a,b)->b.length()-a.length()).limit(1).forEach(System.out::println);
		Arrays.stream(strArray).sorted((a,b)->a.length()-b.length()).limit(1).forEach(System.out::println);
	}
}
