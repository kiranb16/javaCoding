package InterviewProgramm;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInArrays {
	public static void main(String[] args) {

		int arr[] = { 12, 2, 3, 2, 3, 4, 56 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
}
