package basic;

public class Employee {

	int id, age;
	String name, address;

	Employee(int id) {
		this.id = id;
	}

	Employee(int id, int age) {
		this(id);
		this.age = age;

	}

	Employee(int id, int age, String name) {
		this(id, age);
		this.name = name;
	}
	Employee( int id, int age, String name, String address){
		this(id, age, name);
		this.address=address;
	}
	
	public static void main(String[] args) {
		Employee e= new Employee(12, 34);
		Employee e1= new Employee(12, 23, "kiran");
		System.out.println(e);
		System.out.println(e1);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
}
