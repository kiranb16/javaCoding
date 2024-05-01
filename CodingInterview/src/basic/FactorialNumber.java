package basic;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int y=FactorialNumber.factorialvalue(n);
		System.out.println(y);
		
	}
	public static int factorialvalue( int n) {
		if(n==0) 
			return 1;
		return n* factorialvalue(n-1);
	}
}
