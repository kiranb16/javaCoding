package basic;

import java.util.Arrays;

public class LargestNumberInArray {
 public static void main(String[] args) {
	int []arr= {1,2,3,4,5,7,97,45};
	int largestNumber=0;
	/* method 1
	 * Arrays.sort(arr); largestNumber=arr[arr.length-1];
	 * System.out.println(largestNumber);
	 */
	//method two
	int n= arr.length;
	for( int i=0; i<n; i++) {
		if(largestNumber< arr[i]) {
			largestNumber=arr[i];
		}
	}
	System.out.println(largestNumber);
}
}
