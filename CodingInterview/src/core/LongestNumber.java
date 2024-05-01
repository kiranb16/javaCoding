package core;

import java.util.Arrays;

public class LongestNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 8, 9, 6, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		String re = "";
		for (int i = 0; i < arr.length; i++) {
			re = re + arr[i];
		}
		System.out.println(re);
	}
}
