package Collections;

import java.util.HashMap;

public class HashmapExample2 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Kiran");
		map.put(3, "Rahul");
		map.put(2, "Sanjay");
		System.out.println("original hashmap" + map);
		
		int keyTobeRemoved=2;
		map.entrySet().removeIf(e->keyTobeRemoved== e.getKey());
		System.out.println("modified hashmap"+map);
	}
}
