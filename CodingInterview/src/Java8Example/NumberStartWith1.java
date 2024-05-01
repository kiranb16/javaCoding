package Java8Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberStartWith1 {
 public static void main(String[] args) {
	List<Integer> list=  Arrays.asList(12,23,14,45,56);
	list.stream().map(s->s+"").filter(e->e.startsWith("1")).forEach(System.out:: println);
	
	//sorting
	System.out.println("sorting");
	list.stream().sorted().forEach(System.out::println);
	// reverseOrder
	System.out.println("reverse Order");
	 list.stream().sorted(Collections.reverseOrder()).forEach(System.out:: println);
}
}
