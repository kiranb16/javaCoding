package java8NewExample;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers2 {
 public static void main(String[] args) {
	 int number[]= {2,23,45,22,12,11};
	Integer secondhighest= Arrays.stream(number).boxed()
			.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(secondhighest);
}
}
