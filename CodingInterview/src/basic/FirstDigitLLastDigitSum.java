package basic;

import java.util.Scanner;

public class FirstDigitLLastDigitSum {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lastDigit = n % 10;
		System.out.println("last digit :"+lastDigit);
		int firstDigit = n;
		while (firstDigit >= 10) {
			firstDigit = firstDigit / 10;
			System.out.println(firstDigit);
		}
		
		System.out.println("First Digit :"+firstDigit);
		//System.out.println("sum "+(firstDigit+lastDigit));
	}
}
