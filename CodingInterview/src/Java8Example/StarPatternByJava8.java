package Java8Example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StarPatternByJava8 {

	  public static void main(String[] args) {
		int rows=5;
		
		IntStream.rangeClosed(1, rows)
		.mapToObj(i->" ".repeat(rows-i)+"*".repeat(2*i-1))
		.collect(Collectors.toList()).forEach(System.out::println);
	}
}
