package Collections;

import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Kiran");
		map.put(3, "Rahul");
		map.put(2, "Sanjay");
		System.out.println("original hashmap" + map);
		for( Map.Entry<Integer, String> secondMap:map.entrySet()) {
			 
		}
	}
}