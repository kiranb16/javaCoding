package Java8Example;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy2AnyMatch {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 7);
		boolean anymatch = list.stream().anyMatch(x -> x % 2 == 0);
		if(anymatch) {
			System.out.println("atleast one number is divisible by two");
		}else System.out.println("no number is divisible by two");

	}

}
