package Java8Example;

import java.util.HashMap;
import java.util.Map;

public class SortingHashMap {
public static void main(String[] args) {
	Map<String, Integer> map= new HashMap<>();
	map.put( "Kiran",12);
	map.put( "Sai",2);
	map.put( "Snehal",23);
	map.put( "shiv",42);
	map.put( "Rajyog",34);
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
}
}
