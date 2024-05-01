import java.util.Arrays;

public class XX {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		boolean  re =areEqual(arr1, arr2);
		System.out.println(re);
	}

	private static boolean areEqual(int[] arr1, int[] arr2) {
	
		if(arr1.length==arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]==arr2[i]) {
					return true;
				}
			}
		}
		
		return false;
	}
}
