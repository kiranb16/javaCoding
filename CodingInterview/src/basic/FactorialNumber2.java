package basic;

import java.util.Scanner;


public class FactorialNumber2 {

	public static int factorialNumber(int a) {
		if (a == 0) {
			return 1;
		} else
			return a * factorialNumber(a - 1);
	}

	public static void main(String[] args) {
		System.out.println(FactorialNumber2.factorialNumber(5));
	}
}
