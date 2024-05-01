package java8Coding;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
	
	  Predicate<Integer> lessThan=(a)->( a <18);
	  System.out.println(lessThan.test(12));
	  
	  
}
}
