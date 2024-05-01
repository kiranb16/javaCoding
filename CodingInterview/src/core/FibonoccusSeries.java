package core;

public class FibonoccusSeries {
	public static void printFibonacci(int val_1, int val_2, int num) {

		if (num == 0)
			return;

		System.out.print(val_1 + val_2 + " ");

		printFibonacci(val_2, val_1 + val_2, --num);
	}

	public static void main(String args[]) {
		System.out.println(" *** Fibonacci Series *** ");

		System.out.print("0 1 ");

		printFibonacci(0, 1, 10);

	}
}