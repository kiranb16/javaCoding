package Java8Example;

import java.util.ArrayList;
import java.util.List;

public class Employee7 {
  int id;
  String name;
  double salary;
public Employee7(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee7 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
  public static void main(String[] args) {
	List<Employee7> list= new ArrayList<>();
	list.add(new Employee7(1, "A", 12000));
	list.add(new Employee7(2, "B", 14000));
	list.add(new Employee7(4, "C", 13000));
	list.add(new Employee7(3, "D", 16000));
	list.add(new Employee7(5, "E", 18000));
	list.add(new Employee7(7, "F", 19000));
	list.add(new Employee7(8, "G", 11000));
	list.add(new Employee7(6, "H", 13000));
	list.add(new Employee7(9, "I", 12000));
	
	
	
}
}






















