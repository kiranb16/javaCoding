package lambada.Comparator;

import java.util.stream.IntStream;

public class InstreamExample {
 public static void main(String[] args) {
	 //logic 1st;
	 int result=IntStream.rangeClosed(0, 50).sum();
	 System.out.println(result);
	 
	 //logic second
	 
	Integer sum = IntStream.rangeClosed(0, 50).map(Integer:: new ).sum();
	
	System.out.println(sum);
	
}
     

}
