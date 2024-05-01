import java.util.Arrays;

public class Programm1 {
	static int[] arr1 = { 1, 2, 3, 4, 5 };
	static int[] arr2 = { 5, 4, 3, 2, 1 ,6};

	public static boolean areEqual(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;

		if (m != n) {
			return false;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		if(areEqual(arr1, arr2)) {
			System.out.println("arrays are equal");
		}else System.out.println("array are not equal");
	}
}