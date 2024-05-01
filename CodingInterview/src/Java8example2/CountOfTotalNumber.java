package Java8example2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountOfTotalNumber {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,987);
	long count=list.stream().collect(Collectors.counting());
	System.out.println(count);
	
	// simple way to count
	long coun=list.stream().count();
	System.out.println("simple "+coun);
	
	// find max element
	Optional<Integer> max=list.stream().max((a1,a2)->(a1.compareTo(a2)));
	System.out.println("max element "+max);
}
}
