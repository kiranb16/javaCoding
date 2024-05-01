package StringExample;

import java.util.Arrays;
import java.util.List;

public class StringEndsWithSameCharacter {
 public static void main(String[] args) {
	List<String> l1= Arrays.asList("abc","mnm","pop","mno","rty");
	  l1.stream().filter(x->x.length()>0 && x.endsWith(String.valueOf(x.charAt(0))))
	  .forEach(System.out::println);
	  
	 // l1.stream().filter(e->e.length()>0 && e.endsWith(String.valueOf(e.charAt(0)))).forEach(System.out::println);;
}
}
