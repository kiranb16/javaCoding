package Java8example2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicate {
 public static void main(String[] args) {
	 List<String> list= Arrays.asList("AA","BB","CC","AA");
	Map<String, Long> re=list.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(re);
	
 }
}
