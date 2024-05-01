package Java8Example;

import java.util.stream.IntStream;

public class StarPatternByJava82 {
   public static void main(String[] args) {
	   int rows=5;
	   IntStream.rangeClosed(1, rows)
	   .mapToObj(i-> " ".repeat(i-1)+"*".repeat(2*(rows-i)+1))
	   .forEach(System.out::println);
}
}
