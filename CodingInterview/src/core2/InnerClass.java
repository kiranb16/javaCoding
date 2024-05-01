package core2;

import core2.Customer.Person;

class Customer{
	int id;
	String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void show() {
		System.out.println(id+" "+name);
	}
	
	class Person{
		String pName;
		String city;
		public Person(String pName, String city) {
			super();
			this.pName = pName;
			this.city = city;
		}
		
		void display() {
			System.out.println(pName+" "+city);
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		Customer c= new Customer(555, "Kiran");
		
		Customer.Person p =c.new Person("Batwal", "wagholi");
		c.show();
		p.display();
		
	}
}









