package array;

import java.util.Arrays;

public class CopyArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= new  int[a.length];
	
	for(int i=0;  i<a.length;i++) {
		b[i]= a[i];
		//System.out.println(b[i]);
	}
	System.out.println(" orignal Array"+Arrays.toString(a));
	System.out.println(" copy Array"+Arrays.toString(b));
}
}
