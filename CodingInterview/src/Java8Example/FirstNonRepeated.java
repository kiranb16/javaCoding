package Java8Example;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeated {
	public static void main(String[] args) {
	String input="java article are awesome";
	Character result=input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
	.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
	.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
	System.out.println(" non repeat character "+result);
	
	
}
}
