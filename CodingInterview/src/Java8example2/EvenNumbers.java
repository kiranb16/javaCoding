package Java8example2;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(15,23,4,6,8,12);
	list.stream().filter(a->(a%2!=0)).forEach(System.out::println);
	
}
}
