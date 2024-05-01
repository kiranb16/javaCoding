package Java8Example;

import java.util.Arrays;
import java.util.List;

public class Stringexmp {
 public static void main(String[] args) {
	List<String> list= Arrays.asList("abc","dvc","bhc","rty","rjlk");
	  list.stream().filter(e-> e.length()>0&& e.endsWith(String.valueOf(e.charAt(2)))).forEach(System.out::println);
}
}
