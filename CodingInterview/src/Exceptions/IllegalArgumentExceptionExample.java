package Exceptions;

public class IllegalArgumentExceptionExample {

	public static void print(int a) {
		try{if (a >= 18) {
			System.out.println("eligible for voting");
		} else {
         throw new IllegalArgumentException(" not eligible for voting");
		}}catch(IllegalArgumentException e) {
			System.out.println(" exception handled");
		}

	}
	public static void main(String[] args) {
		IllegalArgumentExceptionExample.print(2);
	}
}
