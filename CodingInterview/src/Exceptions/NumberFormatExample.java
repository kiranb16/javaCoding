package Exceptions;

public class NumberFormatExample {
 public static void main(String[] args) {
	// String s="Seven";
	try{int num= Integer.parseInt("Akki");
	System.out.println(num);
	}catch(NumberFormatException e) {
		System.out.println("NumberFormatException  catched");
	}
}
}
