package Java8example2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FoundCharacter {
 public static void main(String[] args) {
	
	String s=" kiran vasant batwal";
	  Map<String, Long> map=Arrays.stream(s.split("")).map(String::toLowerCase)
	  .collect(Collectors.groupingBy(str->str, LinkedHashMap:: new , Collectors.counting()));
	  System.out.println(map);
}
}
