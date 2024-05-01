package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FactorialNumber8{
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		List<Integer> fact=list.stream().map(e->factorialNumber(e)).collect(Collectors.toList());
		System.out.println(fact);
	}

	private static  int factorialNumber(int i) {
	   if(i==0) {
		   return 1;
	   }else {
		   return factorialNumber(i-1)*i;
	   }
		
	}
}
