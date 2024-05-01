package Java8example2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
 public static void main(String[] args) {
	List<Employee> list= new ArrayList<>();
	list.add(new Employee(1, "a", 500,"pune"));
	list.add(new Employee(2, "b", 1000,"pune"));
	list.add(new Employee(3, "c", 1500,"pune"));
	list.add(new Employee(4, "d", 2000,"pune"));
	list.add(new Employee(5, "e", 2500,"mumbai"));
	list.add(new Employee(6, "f", 3000,"mumbai"));
	list.add(new Employee(7, "g", 3500,"mumbai"));
	
	// top 3 salaried person
	list.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
			.limit(3).collect(Collectors.toList()).forEach(System.out::println);;

}
}
