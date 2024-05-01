package Exceptions;

public class StringIndexExample {
 public static void main(String[] args) {
	try{String a=" Hi Kiran How Are you";
	char ch= a.charAt(50);
	System.out.println(ch);
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBoundsException catched");
	}
}
}
