package array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "peru", "apple", "banana");
		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);

//		 separted list with sorting

		Map<Object, List<String>> frui = list.stream().sorted().collect(Collectors.groupingBy(e -> e));
		System.out.println(frui);

	
	}
}
