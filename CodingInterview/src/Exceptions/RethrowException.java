package Exceptions;

public class RethrowException {
 public static void main(String[] args) {
	try {
		String s=null;
		System.out.println(s.length());
		
	} catch (NullPointerException e) {
		System.out.println("nullPointerException handled  ");
		throw e;
	}
}
}
