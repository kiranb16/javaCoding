package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
 public static void main(String[] args) {
	List<String> list= Arrays.asList("AA","BB","CC","AA","CC");
	Map<String, Long> dupl=list.stream().filter(e->Collections.frequency(list, e)>1)
	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(dupl);
}
}
