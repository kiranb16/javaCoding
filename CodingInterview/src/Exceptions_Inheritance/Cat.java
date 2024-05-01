package Exceptions_Inheritance;

import java.io.IOException;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("cat is eating");
	}

	@Override
	public void sleep() throws IOException {
		System.out.println("cat is sleeping");
	}
public static void main(String[] args) throws Exception {
	Animal a= new Cat();
	a.sleep();
	a.eat();
	
}
}
