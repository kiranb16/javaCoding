package singleton;
 class A{
		/*
		 * public A() { System.out.println("A"); }
		 */
	 public void printData() {
		 System.out.println("printing A");
	 }
 }
 class B extends A{
		/*
		 * public B() { System.out.println("B"); }
		 */
	 public void printData() {
		 System.out.println("printing B");
	 }
 }
 class C extends B{
	 public C() {
		 System.out.println("C");
	 }
 }
public class TrickyQuestion {
 public static void main(String[] args) {
	C c= new C();
}
}
