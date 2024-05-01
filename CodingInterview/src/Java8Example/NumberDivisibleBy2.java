package Java8Example;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy2 {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(2,4,6,8,7);
	boolean divisiblebyTwo=list.stream().allMatch(x->x%2==0);
	if(divisiblebyTwo) {
		System.out.println("all numbers are divisible by two");
	}else System.out.println("all numbers are not divisible by two");
}

}
