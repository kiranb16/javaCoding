package Java8Example;

import java.util.ArrayList;
import java.util.List;

class Employee4 {
	private String name;
	private Address address;
	private long Salary;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public Employee4(String name, Address address, long salary) {
		super();
		this.name = name;
		this.address = address;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee4 [name=" + name + ", address=" + address + ", Salary=" + Salary + "]";
	}
	

}

class Address {
	private String city;
	private String state;
	private String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}

public class Employee4Main {
	public static void main(String[] args) {
  List<Employee4> list= new ArrayList<>();
    list.add(new Employee4("ram", new Address("mumbai", "maharastra", "india"), 60000));
    list.add(new Employee4("shreeram", new Address("chennai", "tamilnadu", "india"), 90000));
    list.add(new Employee4("shyam", new Address("pune", "maharastra", "india"), 80000));
    list.stream()
    .filter(e->e.getSalary()>50000 && e.getAddress().getCity()=="chennai").forEach(System.out::println);
	}
	
	
	
	
	
	
	
	
	
	
}














