package basic;

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

public class Employee1 extends Person {
	float salary;

	public Employee1(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee1 e= new Employee1(222, "Kiran", 123456);
		System.out.println(e);
	}

	@Override
	public String toString() {
		return "Employee1 [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}

	

}
