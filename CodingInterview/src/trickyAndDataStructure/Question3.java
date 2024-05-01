package trickyAndDataStructure;

class Vehicle {
	public void drive() {
		System.out.println("vehicle driving");
	}
}

class Car extends Vehicle {
	public void drive() {
		System.out.println("car driving");
	}
}

public class Question3 {
	public static void main(String[] args) {
     //	Car c= new Vehicle(); this not allowed in runtime polymorphism;  this will give compile time error
    //	c.drive();
		
		Vehicle v= new Car();
		v.drive();// output: car driving
		Vehicle v1= new Vehicle();
		v1.drive();// output: vehicle driving
	}
}
