package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Patient {
	private int age;
	private String name;
	private String disese;
	private int bill;

	public Patient(int age, String name, String disese, int bill) {
		super();
		this.age = age;
		this.name = name;
		this.disese = disese;
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Patient [age=" + age + ", name=" + name + ", disese=" + disese + ", bill=" + bill + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisese() {
		return disese;
	}

	public void setDisese(String disese) {
		this.disese = disese;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

}

public class StreamExample {
	public static void main(String[] args) {
		List<Patient> list = new ArrayList<>();
		list.add(new Patient(23, "abc", "corona", 23000));
		list.add(new Patient(24, "bcd", "corona", 13000));
		list.add(new Patient(25, "def", "fever", 43000));
		list.add(new Patient(26, "mno", "corona", 63000));
		list.add(new Patient(27, "stu", "fever", 73000));
		// list of corona patient
		list.stream().filter(e->e.getDisese().equals("corona")).forEach(System.out:: println);
		
		//patient age less than and corona
		System.out.println("*****************patient age less than and corona**************************");
		
		list.stream().filter(e->e.getAge()<25 && e.getDisese().equals("corona")).forEach(System.out:: println);

		//average bill paid by corona patient
		System.out.println("*****************average bill paid by corona patient**************************");
		
	  Double avgbill= list.stream().filter(e->e.getDisese()
			   .equals("corona"))
	   .collect(Collectors.averagingInt(Patient:: getBill));
	  
	  System.out.println("average bill of corona patient :"+avgbill);
		
	}
}
