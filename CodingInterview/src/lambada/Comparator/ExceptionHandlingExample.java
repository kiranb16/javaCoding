package lambada.Comparator;

import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingExample {
 public static void main(String[] args) {
	List<String> list= Arrays.asList("23","34","45","xyz");
	//logic 1st
	
	/*List<Integer> re=list.stream().map(Integer:: parseInt).collect(Collectors.toList());
	System.out.println(re);
	*/
	
	//logic second
	
	
	
	list.forEach(ExceptionHandlingExample:: printList);
	

}
 public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
			
		} catch (Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
	}
}
