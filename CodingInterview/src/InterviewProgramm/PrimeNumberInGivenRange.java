package InterviewProgramm;

import java.util.Scanner;

public class PrimeNumberInGivenRange {

	public static void main(String[] args) {
		int counter = 0; int i = 0;
		String primeNumber = " ";
		for (i = 1; i <= 100; i++) {

			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter=counter +1;
				}
			}
		}
		if (counter == 2) {
			primeNumber = primeNumber + i + " ";
		}
		System.out.println("primeNumbers 1-100 are"+primeNumber);
	}
}
