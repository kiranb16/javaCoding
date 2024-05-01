package java8NewExample;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Numbers {
  public static void main(String[] args) {
	
	  List<Integer> list= Arrays.asList(1,5,6,2,3,4);
	    OptionalInt bigger=list.stream().filter(e->e%2==0).mapToInt(Integer:: intValue).max();
	    System.out.println("bigger"+bigger);
	    
	    long sum=list.stream().filter(e->e%2==0).mapToInt(Integer:: intValue).sum();
	    System.out.println("sum "+ sum);
	    
	    long allSum=list.stream().mapToInt(Integer:: intValue).sum();
	    System.out.println(allSum);
	    
	    List<Integer> odd=list.stream().filter(e->e%2!=0).toList();
	     System.out.println(odd);
	    
	    
	    
}
}
