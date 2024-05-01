package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArray {
  public static void main(String[] args) {
	String [] names= {"kiran","Ravi","Dev"};
	
	List<String> name=Arrays.stream(names).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(name);
	List<String> list= Arrays.asList("ravi","shyam","rehansh");
	list.sort(String.CASE_INSENSITIVE_ORDER);
	System.out.println(list);
}
}
