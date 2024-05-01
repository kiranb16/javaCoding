package Java8example2;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstNonReapetedCharacter {
	public static void main(String[] args) {
		String input = "Kiran Vasant Batwal";
		// input.chars() gives stream of string
		Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1l).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println("first character non reapeated is "+result);

	}
}
