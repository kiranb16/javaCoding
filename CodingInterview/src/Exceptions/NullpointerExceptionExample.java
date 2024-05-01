package Exceptions;

public class NullpointerExceptionExample {
 public static void main(String[] args) {
	try{String a=null;
	System.out.println(a.charAt(2));
	}catch(NullPointerException e) {
		System.out.println("NullPointerException handled");
	}
}
}
