package refrenceMethod;
class A{
	public static void doSomething() {
		System.out.println("do something");
	} 
}
interface Public{
	public static void doSomething() {
		System.out.println("do something");
	}
	default void say() {
		System.out.println("hello");
	}
}
public class StaticMethodInterface implements Public {
	
  public static void main(String[] args) {
	A.doSomething();
	Public.doSomething();
	StaticMethodInterface s= new StaticMethodInterface();
    s.say();// default method
}

@Override
public void say() {
	System.out.println(" child saying hi ");

}
}
