package array;

import java.util.Arrays;

public class FindLargestAndSecondLargest {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 3 };
//	  Arrays.sort(a);
//	  System.out.println("largest "+a[a.length-1] +" second "+a[a.length-2]);

		int lagest = 0, secondlargest = 0;
		for (int i = 0; i < a.length; i++) {
			if (lagest < a[i]) {
				secondlargest = lagest;
				lagest = a[i];

			}else if( secondlargest<a[i]) {
				secondlargest= a[i];
			}
		}
		System.out.println("largest "+lagest +" second largest "+secondlargest);
		
		
		System.out.println(" max in array"+Arrays.stream(a).max());
		

		Integer se=Arrays.stream(a).boxed().sorted((c,b)->b.compareTo(c)).findFirst().get();
		System.out.println("second largest :"+se);

	}
}
