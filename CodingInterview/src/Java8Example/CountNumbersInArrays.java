package Java8Example;

import java.util.Arrays;
import java.util.List;

public class CountNumbersInArrays {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		long count = numbers.stream().count();
		System.out.println(count);

		int max = numbers.stream().max((x, y) -> x - y).get();
		System.out.println("max numbers  "+max);
		
		int min= numbers.stream().min((x,y)->x-y).get();
		System.out.println("minimum numbers "+min);
	}
}
