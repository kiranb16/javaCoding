package array;

import java.util.Arrays;

public class MoveNegativeElement {
  public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,-1,-3,-4,45,0};
	
	int newArr[]= new int [arr.length];
	int j=0;
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<=0) {
			newArr[j]=arr[i];
			j++;
		}
	}
	for(int k=0; k<arr.length; k++) {
		if(arr[k]>0) {
			newArr[j]=arr[k];
			j++;
		}
	}
	System.out.println(Arrays.toString(newArr));
	
}
}
