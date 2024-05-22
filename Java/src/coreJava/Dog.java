package coreJava;
class Animal{
	void eat() {
		System.out.println("Animal eating");
	}
}
public class Dog extends Animal{
	void eat() { System.out.println("Dog eating");}
	void bark() {System.out.println("dog barking");}
	void work() {
		super.eat();
		bark();
	}
	public static void main(String[] args) {
		Dog d= new Dog();
		d.work();
	}
}