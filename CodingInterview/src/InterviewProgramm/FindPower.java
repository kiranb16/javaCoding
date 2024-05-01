package InterviewProgramm;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		System.out.println("enter number and power");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int p = sc.nextInt();
		int power=FindPower.power(b, p);
		System.out.println("b :"+b+" p: "+p);
		System.out.println(power);
	}

	private static int power(int b, int p) {
		int power = 1;
		for (int i = 1; i <= p; i++) {
			power = power * b;
		}
		return power;
	}
}
