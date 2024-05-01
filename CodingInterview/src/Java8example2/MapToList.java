package Java8example2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.management.ValueExp;

public class MapToList {
public static void main(String[] args) {
	Map<Integer, String> map= new HashMap<>();
	map.put(1, "one");
	map.put(2, "two");
	map.put(3, "three");
	
	// for keyset
	List<Integer> keys=map.keySet().stream().collect(Collectors.toList());
	System.out.println(keys);
	
	//for value
	List<String> values=map.values().stream().collect(Collectors.toList());
	System.out.println(values);
}
}
