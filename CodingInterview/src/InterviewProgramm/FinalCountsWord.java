package InterviewProgramm;

import java.util.HashMap;

public class FinalCountsWord {
	public static void main(String[] args) {

		String str = "rockstar the life";
		String[] split = str.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);

			} else
				map.put(split[i], 1);
		}
		System.out.println(map);

	}
}
