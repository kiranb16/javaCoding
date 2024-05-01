package java8NewExample;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee2{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class sortingExample {
	public static void main(String[] args) {
      Map<Employee2, Integer> map= new TreeMap<>();
      map.put(new Employee2(12, "Kiran", 12000), 20);
      map.put(new Employee2(16, "Ravi", 13000), 70);
      map.put(new Employee2(18, "Kiran", 15000), 50);
      map.put(new Employee2(13, "Kiran", 17000), 30);
      
      map.entrySet().stream().sorted(Map.Entry
    		  .comparingByKey(Comparator.comparing(Employee2:: getSalary))).forEach(System.out::println);
      
      
      
	}
}










































