package comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee{
  private int id;
  private String name;
  private String city;
public Employee(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}
public static void main(String[] args) {
	Employee e= new Employee(100,"Kiran","wagholi");
	Employee e1= new Employee(200,"Ravindra","netwad");
	Employee e2= new Employee(400,"Avadhut","junnar");
	Employee e3= new Employee(300,"malhar","pune");
	
	List<Employee> list= new ArrayList<>();
	list.add(e);list.add(e1);list.add(e2);list.add(e3);
	List<String> names =list.stream().map(Employee::getName).collect(Collectors.toList());
	List<Object> id= list.stream().map(Employee::getId).collect(Collectors.toList());
	System.out.println(id);
	System.out.println("***************************************************");
	System.out.println(names);
	System.out.println("*****************************************************");
	List<String> ci= list.stream().map(Employee::getCity).collect(Collectors.toList());
	System.out.println(ci);
}
}