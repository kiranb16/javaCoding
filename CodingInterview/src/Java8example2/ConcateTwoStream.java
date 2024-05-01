package Java8example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoStream {
 public static void main(String[] args) {
	List<String> list1= Arrays.asList("kiran","Ravindra");
	List<String> list2= Arrays.asList("Sandip","Sunita");
	  Stream.concat(list1.stream(), list2.stream())
			   .forEach(e->System.out.print(" "+e));
	  //result.forEach(System.out:: println);
	
}
}
