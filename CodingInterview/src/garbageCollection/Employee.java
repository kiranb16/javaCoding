package garbageCollection;

public class Employee {
	int id;
	String name;

	Employee() {
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// set null  ref to call Garbage collection;
		Employee e = new Employee();
		e = null;
		
		
		
		
	}
}
