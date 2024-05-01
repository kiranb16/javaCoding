package java8Coding;

public class Employee2 {
  String name;
  int age;
  String gender;
  String dep;
  int yearJoin;
  double salary;
public Employee2(String name, int age, String gender, String dep, int yearJoin, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.dep = dep;
	this.yearJoin = yearJoin;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
public int getYearJoin() {
	return yearJoin;
}
public void setYearJoin(int yearJoin) {
	this.yearJoin = yearJoin;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee2 [name=" + name + ", age=" + age + ", gender=" + gender + ", dep=" + dep + ", yearJoin=" + yearJoin
			+ ", salary=" + salary + "]";
}
  
}
