package core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
	public static void main(String[] args) {
		String s = "Banana";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer value = map.get(c);
			if (value != null) {
				map.put(c, new Integer(value + 1));
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

		Map<String, Long> result = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

	}
}
