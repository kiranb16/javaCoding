package basic;

class Animal {
	Animal() {
		System.out.println("animal created");
	}

}

public class Dog extends Animal {
	Dog() {
		super();
		System.out.println("dog is created");
	}
	

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d);

	}

}
