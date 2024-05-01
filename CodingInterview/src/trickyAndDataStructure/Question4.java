package trickyAndDataStructure;

class Vehicle4 {
	public void drive() {
		System.out.println("vehicle driving");
	}
}

class Car4 extends Vehicle4 {
	public void drive() {
		System.out.println("car driving");
	}
	public void playMusic() {
		System.out.println("music play in car");
	}
}

public class Question4 {
 public static void main(String[] args) {
	Vehicle4 v1= new Car4();
	v1.drive();
	//v1.playMusic(); this method is not allowed to 
}
}
