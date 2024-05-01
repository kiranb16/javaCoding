package refrenceMethod;

interface Sayable{
	void say();
}
public class StaticRefMethod2 {
 public static void saySomething() {
	 System.out.println("this is static method");
 }
 public static void main(String[] args) {
	 Sayable sayable= StaticRefMethod2::saySomething;
	 sayable.say();
}
}

/*
interface Sayable{  
void say();  
}  
public class MethodReference {  
public static void saySomething(){  
    System.out.println("Hello, this is static method.");  
}  
public static void main(String[] args) {  
    // Referring static method  
    Sayable sayable = MethodReference::saySomething;  
    // Calling interface method  
    sayable.say();  
}  
}  */