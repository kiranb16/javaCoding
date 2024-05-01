package Java8example2;

import java.util.Arrays;
import java.util.List;

public class SumUsingjava8 {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(2,3,4,5,6,7);
	Integer sum=list.stream().reduce(0,(a,b)->(a+b));
	System.out.println(sum);
	
	//second way
	Integer suu=list.stream().reduce(0,Integer::sum);
	System.out.println(suu);
}
}
