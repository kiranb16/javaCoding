package trickyAndDataStructure;


class Vehicle5 {
	int maxSpeed=200;
	public static void drive() {
		System.out.println("vehicle driving");
	}
	
	public void race() {
		System.out.println("driving at "+maxSpeed);
	}
}

class Car5 extends Vehicle5 {
	int maxSpeed=100;
	public static void drive() {
		System.out.println("car driving");
	}
	public void race() {
		System.out.println("driving at speed "+maxSpeed);
	}
}
public class Question5 {
  public static void main(String[] args) {
	Vehicle5 v= new Car5();
	Vehicle5.drive(); // v.drive();  // static private and final method cannot overridden
	  v.race();
	  System.out.println(v.maxSpeed);// it gives parent class variable 
	  
	  Car5 c=new Car5();
	  System.out.println(c.maxSpeed);
}
}
