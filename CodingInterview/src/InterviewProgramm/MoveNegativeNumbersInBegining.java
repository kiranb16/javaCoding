package InterviewProgramm;

import java.util.Arrays;

public class MoveNegativeNumbersInBegining {
	public static void main(String[] args) {
		int arr[] = { -12, -11, -13, -15, 2, 3, 4, -18 };
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(arr));
	}
}
