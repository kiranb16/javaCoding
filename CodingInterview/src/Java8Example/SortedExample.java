package Java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 6, 3, 1, 2, 9, 5);
		List<Integer> sortedlist = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		List<Integer> revsortedlist = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("reverse Order");
		System.out.println(revsortedlist);
		
		System.out.println("multiply by 2");
		
		List<Integer> multy=numbers.stream().map(a->a*2).toList();
		System.out.println(multy);
	}
}
