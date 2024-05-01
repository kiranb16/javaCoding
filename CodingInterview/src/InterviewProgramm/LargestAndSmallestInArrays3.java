package InterviewProgramm;

import java.util.Arrays;
import java.util.List;

public class LargestAndSmallestInArrays3 {
	public static void main(String[] args) {
		int arr[] = { 23, 34, 45, 12, 32, 67, 89, 99, -12, 2, 3, -67 };
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("max element :" + max);
		System.out.println("min element :" + min);

	}
}
