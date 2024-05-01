package oops;
class Book{
	public void print(Object  str) {
		System.out.println("print "+str);
	}
	public void print( Integer age) {
		System.out.println("print "+age);
	}
	/*
	 * public void print( Double salary) { System.out.println("print "+salary); }
	 */
}
public class MethodOverloading {
public static void main(String[] args) {
	Book book= new Book();
	book.print(null);
}
}
