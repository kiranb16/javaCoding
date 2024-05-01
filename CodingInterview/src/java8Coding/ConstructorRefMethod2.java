package java8Coding;

import java.util.function.Function;

class Student2 {
	String name;

	Student2(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

interface MyFunctionalInterface {
	Student2 getStudent(String name);
}

public class ConstructorRefMethod2 {
	public static void main(String[] args) {
     MyFunctionalInterface mf= Student2:: new;
     Function<String, Student2> f1= Student2:: new;
     Function<String, Student2> f2= name-> new Student2(name);
     System.out.println(mf.getStudent("Kirhan Batwal").getName());
     System.out.println(f1.apply("MalharBatwal").getName());
     System.out.println(f2.apply("Avadhut Batwal").getName());
     
		
		
	}
}
