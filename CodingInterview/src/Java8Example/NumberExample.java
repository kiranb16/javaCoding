package Java8Example;

import java.util.Arrays;
import java.util.List;

public class NumberExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 23, 16, 1, 5, 45, 67);
		// no starts with 1
		System.out.println("no start with 1");
		list.stream().map(s->s+"").filter(e->e.startsWith("1")).forEach(System.out::println);
		
		//program to count how much Integer
		System.out.println("Integer in list");
		Long liste=list.stream().filter(e->e.equals("")).count();
		System.out.println(liste);
		System.out.println("--------------------------------------------");
	  int [] a= {12, 23, 16, 1, 5, 45, 67};
	  int len= a.length;
	  int  count=0;
	  for(int i=len-1; i>=0; i--) {
		  
		  count++;
	  }System.out.println(count);
		
	}
}
