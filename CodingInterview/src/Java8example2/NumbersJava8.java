package Java8example2;

import java.util.Arrays;
import java.util.List;

public class NumbersJava8 {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(12,34,45,67,13);
	// map to requiered convert into string
	list.stream().map(a->a+"").filter(a->a.startsWith("1")).forEach(a->System.out.println(a));
}
}
