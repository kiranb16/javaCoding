package InterviewProgramm;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = { 100, 14, 45, 23, 46, };
		int secondlargest = 0;
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("secondlargest "+secondlargest);
		System.out.println("largest "+largest);

	}
}
