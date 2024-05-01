package java8Coding;
interface Sayable{
	void say();
}
class InstanceMethod{
	void saySomething() {
		System.out.println(" hi hello kaise ho");
	}
}
public class InstanceMethodRef {
public static void main(String[] args) {
	InstanceMethod instanceMethod= new InstanceMethod();
	Sayable sa= instanceMethod::saySomething;
	sa.say();
	
	Sayable s= new InstanceMethod():: saySomething;
	s.say();
}
}
