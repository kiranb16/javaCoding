package java8NewExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
	
	  List<Employee> list= Arrays.asList(new Employee(1, "Aaaa", "pune"), new Employee(6, "bbb", "pune"),
			   new Employee(8, "cccc", "Mumbai"));
	  List<Employee> list2= Arrays.asList(new Employee(4, "Aakkk", "vashi"), new Employee(5, "ooobbb", "pune"),
			   new Employee(9, "uuucccc", "Mumbai"));
	  
	  // employee start with "a"
	  list.stream().filter(e->e.getName().startsWith("A"))
	  .collect(Collectors.toList()).forEach(System.out::println);
	  
	  // merge two list annd compare with  id
	  
	  System.out.println("merge two list annd compare with  id");
	  Stream.concat(list.stream(), list2.stream())
	  .sorted(Comparator.comparingInt(Employee::getId)).forEach(System.out::println);
	 
	 // sum of even number 
	  List<Integer> number= Arrays.asList(1,2,3,4,5,6);
	  int sumOfEven=number.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
	  System.out.println("sum of even number :"+sumOfEven);
	  
	  int odd= number.stream().filter(e->e%2!=0).mapToInt( Integer:: intValue).sum();
	  System.out.println(" odd number sum :"+odd);
	  
	 
	  
	  
}
}
