package Exceptions_Inheritance;

class Student{
	int id;
	String name;
	
	void check() throws NullPointerException{
		System.out.println(id+" "+name);
	}
}
public class SupercalssException extends Student{

	
	void check() throws RuntimeException {
		System.out.println("method from child");
	}
	public static void main(String[] args) {
		SupercalssException e= new SupercalssException();
           e.check();
           
           Student s= new Student();
           s.check();
	}

}
