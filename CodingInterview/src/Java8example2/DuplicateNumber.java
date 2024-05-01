package Java8example2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(12,12,3,4,3,4,5);
	Set<Integer> set= new HashSet<>();
	list.stream().filter(a->!set.add(a)).forEach(System.out::println);
	
	System.out.println("max element");
	list.stream().max((o1,o2)->(o1.compareTo(o2))).ifPresent(System.out::println);
	
}
}
