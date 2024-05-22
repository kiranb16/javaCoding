package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RotateArray {
 public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int n=3;
	for(int i=0; i<n; i++) {
		int first=arr[0], j;
		
		for(j=0; j<arr.length-1; j++) {
			arr[j]= arr[j+1];
		}
		arr[j]=first;
	}
	System.out.println(Arrays.toString(arr));
}
}
