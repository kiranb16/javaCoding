package Java8Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToList {
 public static void main(String[] args) {
	Map<Integer,  String> map= new HashMap<>();
	map.put(101, "malhar");
	map.put(103, "Ravi");
	map.put(105, "Batwal");
	
	List<Integer> keylist= new ArrayList<>(map.keySet());
	List<String> valaueSet= new ArrayList<>(map.values());
	keylist.forEach(System.out::println);
	System.out.println("...................................................");
	valaueSet.forEach(System.out::println);
	
	
}
}
