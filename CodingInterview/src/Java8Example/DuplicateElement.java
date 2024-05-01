package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "java8", "java", "Kiran", "Kiran");
		Map<String, Long> name = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(name);

		System.out.println("---------------------------------------");
		List<String> re = name.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(" only name with havinfg value more than 2 :"+re);
	}
}
