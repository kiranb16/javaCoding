package basic;
class Animal4{
	Animal4(){
		System.out.println("Animal eating");
	}
}
public class Dog4   extends Animal4 {
	Dog4(){
		System.out.println("dog is eating");
	}
public static void main(String[] args) {
	 Animal4 a= new Dog4();
	 System.out.println(a);
}
}
