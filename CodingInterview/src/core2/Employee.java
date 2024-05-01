package core2;

public class Employee {
 String name;
 String dep;
 double sal;
public Employee(String name, String dep, double sal) {
	super();
	this.name = name;
	this.dep = dep;
	this.sal = sal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", dep=" + dep + ", sal=" + sal + "]";
}
 
}
