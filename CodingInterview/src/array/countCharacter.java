package array;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countCharacter {
	public static void main(String[] args) {
		String s = "Hello";
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();
		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);

		Map<Integer, Long> res = s.chars().boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(res);
	}
}
