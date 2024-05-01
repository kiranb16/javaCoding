package java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
public static void main(String[] args) {
	List<String> list=Arrays.asList("KirhanBatwal","RavindraBatwal","MalharBatwal");
	Optional<String> longest=list.stream().reduce((a,b)->a.length()>b.length()? a:b);
	longest.ifPresent(System.out::println);
	
	List<Integer> sum= Arrays.asList(2,3,4,5,6,7);
	Optional<Integer> summ=sum.stream().reduce((a,b)->(a+b));
	System.out.println("sum "+summ);
	
	Optional<Integer> multi=sum.stream().reduce((a,b)->a*b);
	multi.ifPresentOrElse(System.out::println, null);
}
}
