package Java8example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {
 public static void main(String[] args) {
	List<String> list= Arrays.asList("AA","BB","AA","CC");
	Map<String, Long> names=list.stream().filter(x->Collections.frequency(list, x)>1)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(names);
}
}
