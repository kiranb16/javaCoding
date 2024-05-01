package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee5 {
	String name;
	String city;

	public Employee5(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}

}

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee5> list = new ArrayList<>();
		list.add(new Employee5("Kiran", "pune"));
		list.add(new Employee5("Ganesh", "pune"));
		list.add(new Employee5("sanjay", "kharadi"));
		list.add(new Employee5("sagar", "kharadi"));
//		list.stream().collect(Collectors.groupingBy(Employee5::getCity)).entrySet()
//		.forEach(x -> System.out.println(x));

//		list.stream().collect(Collectors.groupingBy(Employee5::getCity)).entrySet().forEach(x -> {
//			System.out.println(x.getKey() + "=");
//			System.out.println(x.getValue().stream().map(Employee5::getName).collect(Collectors.joining(",")));
//		});
		
		list.stream().collect(Collectors.groupingBy(Employee5::getCity)).entrySet().forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		
		list.stream().collect(Collectors.groupingBy(Employee5::getCity)).entrySet().forEach(x->{
			System.out.println(x.getKey()+"=");
			
			System.out.println(x.getValue().stream().map(Employee5::getName).collect(Collectors.joining(",")));
		});
		

	}
}












