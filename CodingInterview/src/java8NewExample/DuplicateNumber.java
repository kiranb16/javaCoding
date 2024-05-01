package java8NewExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
  public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,2,2,3,3,4,5,6,6);
	 Set<Integer> set= new HashSet<>();
	 
	 list.stream().filter(e->!set.add(e)).forEach(System.out::println);
	 
	 System.out.println("...........................................................");
	 list.stream().findFirst().ifPresent(System.out::println);
	 
	 System.out.println(".........................max integer..................................");
	 
	 Integer max=list.stream().max(Integer::compare).get();
	 System.out.println("max element "+max);
	 
	 Integer min=list.stream().min(Integer::compare).get();
	 System.out.println(min);
	 
	 
}
}
