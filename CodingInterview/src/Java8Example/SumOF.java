package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOF {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(10,20,30,40,50);
	Integer sum=list.stream().reduce(0,Integer::sum);
	list.stream().map(x->x+sum).collect(Collectors.toList()).forEach(System.out::println);
}
}
