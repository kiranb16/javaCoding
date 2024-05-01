package java8NewExample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReapetedCharacter {
 public static void main(String[] args) {
	 String input="KiranVasantBatwal";
	  Map<String, List<String>> map= Arrays.stream(input.split("")).collect(Collectors.groupingBy(s->s));
	  System.out.println(map);
	  System.out.println(".........................................................");
	  
	 Map<String, Long> map1= Arrays.stream(input.split(""))
	  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 System.out.println(map1);
	 
	 System.out.println("duplicate character");
	List<String> duplicate= Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	 .entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry:: getKey).collect(Collectors.toList());
	System.out.println(duplicate);
	
	System.out.println("unique element");
	List<String> uniqueelement=Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
	System.out.println(uniqueelement);
	
	System.out.println("first non reapeted");
	
	 String nonreapeted =Arrays.stream(input.split(""))
	.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
	.entrySet().stream().filter(s->s.getValue()==1).findFirst().get().getKey();
	 System.out.println(nonreapeted);
	

}
}
