package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesName {
public static void main(String[] args) {
	List<String> list=Arrays.asList("france","Bharat","Shrilanka","Usa");
	String str=list.stream().map(e->e.toUpperCase()).collect(Collectors.joining(","));
	System.out.println(str);
}
}
