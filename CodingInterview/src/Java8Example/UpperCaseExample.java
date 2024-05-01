package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseExample {
public static void main(String[] args) {
	List<String> list= Arrays.asList("mango","apple","banana");
	List<String> l=list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
	System.out.println(l);
}
}
