package java8Coding;
class Child{
	void eat() {
		System.out.println("child eating");
	}
	
}
class Boy extends Child{
	void eat() {
		System.out.println("Boy eating");
	}
	
}

public class Student extends Boy{
	void eat() {
		System.out.println("student eating");
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.eat();
		
	}
	
	}
