package Java8example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseExample {
 public static void main(String[] args) {
	List<String> list= Arrays.asList("kiran","batwal","ram");
	list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
	
	// second way
	List<String> re=list.stream().map(String:: toUpperCase).collect(Collectors.toList());
	System.out.println(re);
	
	
}
 
}
