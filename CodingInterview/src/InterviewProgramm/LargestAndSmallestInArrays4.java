package InterviewProgramm;

public class LargestAndSmallestInArrays4 {
	public static void main(String[] args) {
		int arr[] = { 23, 34, 45, 12, 32, 67, 89, 99, -12, 2, 3, -67 };
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest element is :" + smallest);

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("largest number is "+largest);
	}
}