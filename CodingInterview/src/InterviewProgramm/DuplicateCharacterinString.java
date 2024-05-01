package InterviewProgramm;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterinString {
	public static void main(String[] args) {
		String str = " i am happy confident";

		Map<Character, Integer> charmap = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (!charmap.containsKey(c)) {
				charmap.put(c, 1);

			} else {
				charmap.put(c, charmap.get(c) + 1);
			}
		}
		System.out.println(charmap);
	}
}
