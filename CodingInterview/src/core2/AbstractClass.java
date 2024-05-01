package core2;
  
interface Animal{
	default void eat() {
		System.out.println("eating");
	}
}

public class AbstractClass implements Animal{
	public static void main(String[] args) {
		
		AbstractClass a= new AbstractClass();
		a.eat();
		 
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		Animal.super.eat();
	}
}