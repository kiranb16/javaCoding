package Java8Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordInList {
public static void main(String[] args) {
	List<String> list= Arrays.asList("aa","bb","dd","bb","dd");
//	Map<String, Long> frequency=list.stream().filter(x->Collections.frequency(list, x)>1)
//	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	System.out.println(frequency);
	
	Map<String, Long> freq=list.stream().filter(x-> Collections.frequency(list, x)>1)
	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(freq);
}

}
