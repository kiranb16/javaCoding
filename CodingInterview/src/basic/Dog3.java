package basic;
class Animal3{
	void eat() {
		System.out.println(" animal eatinng bread");
	}
}
public class Dog3 extends Animal3 {
  void eat() {
	  System.out.println("dog is eating");
  }
   void bark() {
	   System.out.println(" dog barking");
   }
   
   void work() {
	   bark();
	   super.eat();
   }
   public static void main(String[] args) {
	Dog3  d= new Dog3();
	d.work();
}
}
