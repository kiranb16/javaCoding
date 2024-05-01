package InterviewProgramm;

import java.util.Arrays;

public class LargestAndSmallestInArrays {

	public static int getLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 1];
	}

	public static int get3Largest(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 3];
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println("largest :" + getLargest(a, 6));
		System.out.println("smallest :" + getLargest(a, 1));
		System.out.println("thirdLargest : "+get3Largest(a, 6));

	}
}
