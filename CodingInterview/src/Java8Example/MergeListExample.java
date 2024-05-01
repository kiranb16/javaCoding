package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListExample {
  public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,2,3,4,5,6);
	List<Integer> list1= Arrays.asList(3,4,5,6,7,8,9);
	List<Integer> mergedList= Stream.concat(list.stream(), list1.stream()).collect(Collectors.toList());
	System.out.println("mergedlist");
	System.out.println(mergedList);
	System.out.println("uniquelist");
	/*
	 * List<Integer>
	 * unique=mergedList.stream().distinct().collect(Collectors.toList());
	 * System.out.println(unique);
	 */
	  Set<Integer> unique= mergedList.stream().collect(Collectors.toSet());
	  System.out.println(unique);
}
}
