package core3;
 
class Parent{
	public void print() {
		System.out.println("parent");
	}
}
class Child extends Parent{

	@Override
	public void print() {
		System.out.println("child");
	
	}
	
}
public class InheritanceExample {
	public static void PrintMain(Parent o) {
		o.print();
	}
 public static void main(String[] args) {
	Parent x= new Parent();
	Parent y= new Child();
	Child z= new Child();
	
	PrintMain(x);
	PrintMain(y);
	PrintMain(z);
}
}
