package InterviewProgramm;

public class MaxAndMinArray {
	public static void main(String[] args) {

		int a[] = { 34, 2, 3, 4, 5 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max element is " + max);

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("min element is :"+min);
	}
}
