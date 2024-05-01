package lambadaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Coll_lambada {
 public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	list.add(123);
	list.add(23);
	list.add(12);
	list.stream().sorted((a1,a2)->a1.compareTo(a2)).forEach(System.out::println);
	System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
	
	Map<Integer, String> map= new HashMap<>();
	map.put(12, "mango");
	map.put(11, "mappper");
	map.put(14, "melon");
	map.put(10, "ma");
	Map<Integer, String> sortedMap=map.entrySet().stream().sorted(Map.Entry.comparingByKey())
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
	System.out.println(sortedMap);
}
}
