package Java8example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInteger {
  public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,3,4,5,6,7,8,8,2,2,3);
	
	Set<Integer> number= new LinkedHashSet<>(list);
	/*
	 * List<Integer> noWithoutDuplicate= new ArrayList<Integer>(number);
	 * System.out.println(noWithoutDuplicate);
	 */
	System.out.println(number);
}
}
