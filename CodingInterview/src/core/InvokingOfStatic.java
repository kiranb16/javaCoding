package core;
class Student1{
	static void  doStudy() {}
}

public class InvokingOfStatic {
static {
	System.out.println("static block invoked ");
}
 public InvokingOfStatic() {
	System.out.println("constructor method invoked");
 }
 public static void main(String[] args) {
	 System.out.println("main method invoked");
}
}
