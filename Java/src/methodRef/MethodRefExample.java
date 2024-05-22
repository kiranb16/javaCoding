package methodRef;
interface Printable{
	void print(String msg); 
		
}
public class MethodRefExample{
	private static String msg;
	public void display(String msg) {
		msg= msg.toUpperCase();
		System.out.println(msg);
		}
	public static void main(String[] args) {
		MethodRefExample methodRefExample= new MethodRefExample();
		Printable printable=(msg)-> methodRefExample.display(msg);
		printable.print("Kiran Batwal");
		
	}
}