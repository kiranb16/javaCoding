package Java8example2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfList {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,2,3,4,5);
	Optional<Integer> sum=Optional.of(list.stream().reduce((a,b)->a+b)).get();
	System.out.println(sum);
}
}
