package streamSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import comparator.Employee;

public class StreamSortFruits {
public static void main(String[] args) {
	List<String> fruits= new ArrayList<>();
	fruits.add("mango");
	fruits.add("banana");
	fruits.add("apple");
	fruits.add("pinapple");
	fruits.add("lemon");
	 List<String> sortedList=fruits.stream()
			 .sorted(Comparator.naturalOrder())
			 .collect(Collectors.toList());
	          System.out.println(sortedList);
	          System.out.println("*********************************");
	// sorting by lambda expression.
	         List<String> sortList2 =fruits.stream()
	        		 .sorted((o1, o2)-> o1.compareTo(o2))
	        		 .collect(Collectors.toList());
	         System.out.println(sortList2);
	         
	         System.out.println("**********************************************");
	         
	   //sorting by simple way
	         List<String> sortedList2 =fruits.stream().sorted().collect(Collectors.toList());
	         System.out.println(sortedList2);
	         
	         System.out.println("@@@@Descending Order@@@@");
	         
	       List<String> sortedList3 = fruits.stream()
	    		           .sorted(Comparator
	    				   .reverseOrder())
	    		           .collect(Collectors.toList());
	                       System.out.println(sortedList3);
	                       
	      List<String> sortedList4= fruits.stream()
	    		  .sorted((o1,o2)->o2.compareTo(o1))
	    		  .collect(Collectors.toList());
	          System.out.println(sortedList4);
	          
	          List<Employee> employees= new ArrayList<>();
	          employees.add(new Employee(444, "Kiran", "wagholi"));
	          employees.add(new Employee(111, "Ganesh", "pune"));
	          employees.add(new Employee(333, "chiku", "nagar"));
	          List<Employee> employeessorted   = employees.stream().sorted(new Comparator<Employee>() {

				@Override
				public int  compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return (int)(o1.getId()-o2.getId());
				}}).collect(Collectors.toList());
	          System.out.println(employeessorted);
	          
	          List<Employee> employeessorted2  = employees.stream()
	        		  .sorted((o1, o2)->(int)(o1.getId() - o2.getId()))
	        		  .collect(Collectors.toList());
	          System.out.println(employeessorted2);
}
}














