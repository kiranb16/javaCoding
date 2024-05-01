package java8Coding;

import java.util.Arrays;

public class DistinctExample {
	public static void main(String[] args) {
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 4, };
		Arrays.stream(first).filter(x -> (Arrays.stream(second).anyMatch(y -> y == x))).distinct()
				.forEach(System.out::println);

	}
}
