package lambada.Comparator;

import java.util.List;

public class Person {
String name;
int height;
String gender;
double salary;
int kids;
List<String> hobbies;
public Person(String name, int height, String gender, double salary, int kids, List<String> hobbies) {
	super();
	this.name = name;
	this.height = height;
	this.gender = gender;
	this.salary = salary;
	this.kids = kids;
	this.hobbies = hobbies;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getKids() {
	return kids;
}
public void setKids(int kids) {
	this.kids = kids;
}
public List<String> getHobbies() {
	return hobbies;
}
public void setHobbies(List<String> hobbies) {
	this.hobbies = hobbies;
}
@Override
public String toString() {
	return "Person [name=" + name + ", height=" + height + ", gender=" + gender + ", salary=" + salary + ", kids="
			+ kids + ", hobbies=" + hobbies + "]";
}

}
