package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SumUsingJava8 {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(2,3,4,5,6,7);
	int max=list.stream().mapToInt(a->a).max().getAsInt();
	System.out.println("biggest element :"+max);
	int min=list.stream().mapToInt(a->a).min().getAsInt();
	System.out.println("smallest element :"+min);
	
	int sum=list.stream().mapToInt(a->a).sum();
	System.out.println("sum of element "+sum);
}
}
