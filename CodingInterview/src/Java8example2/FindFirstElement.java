package Java8example2;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(16,12,34,56,78);
	list.stream().findFirst().ifPresent(System.out::println);
	
	// find any
	list.stream().findAny().ifPresent(a->System.out.println("find any method "+a));
}
}
