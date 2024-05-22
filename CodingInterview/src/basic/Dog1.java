package basic;
class Animal1{
	String colour="white";
}
public class Dog1 extends Animal1{
  String colour="black";
  
  void printColour() {
	  System.out.println(colour);
	  System.out.println(super.colour);
  }
  public static void main(String[] args) {
	Dog1 d= new Dog1();
	  d.printColour();
	
	   
}
}
