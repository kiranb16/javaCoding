package core2;

import java.util.HashSet;
import java.util.Set;

public class ArrayExample {
	public static void main(String[] args) {
		int arr1[] = { 34, 4, 5, 67, 89, 90, 23 };
		int arr2[] = { 34, 4, 5, 67, 89, 45, 56};
      printIntersection(arr1, arr2);
      printUnionOfArray(arr1,arr2);
	}

	private static void printUnionOfArray(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0; i<arr2.length;i++) {
			set.add(arr1[i]);
		}
		System.out.println("union of arrays");
		System.out.println(set);
		
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
       
		for(int i=0; i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}
}
