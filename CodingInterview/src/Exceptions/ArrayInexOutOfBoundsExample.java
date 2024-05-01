package Exceptions;

public class ArrayInexOutOfBoundsExample {
 public static void main(String[] args) {
	try{int a[]= new int[5];
	 System.out.println(" accessing sixth element"+a[6]);
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("ArrayIndexOutOfBoundsException catched");
	 }
}
}
