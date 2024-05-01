package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapToList {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Kiran");
		map.put(3, "Rahul");
		map.put(2, "Sanjay");
		ArrayList<Integer> list= new ArrayList<>(map.keySet());
		ArrayList<String> list1= new ArrayList<>(map.values());
		System.out.println("key "+list);
		System.out.println("values "+list1);
	}
}
