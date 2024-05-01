package Java8example2;

import java.util.Arrays;
import java.util.List;

public class CubeJava8 {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(2,3,4,5,6);
	list.stream().map(a->a*a*a).filter(a->a>50).forEach(System.out::println);
}
}
