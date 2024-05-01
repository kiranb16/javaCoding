package core;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
     int a[]= {2,8,6,5,4};
     int b[]= {9,1,3,7};
        
     int a1=a.length;
     int b1= b.length;
     int c1= a1+b1;
     int c[]= new int[c1];
     
     for(int i=0; i<a.length;i++) {
    	 c[i]= a[i];
    	// System.out.println(c[i]);
     }
     for(int i=0 ;i<b.length; i++) {
    	 c[a1+i]=b[i];
     }
     for( int i=0; i<c1; i= i+1) {
    	 System.out.println(c[i]);
     }
     Arrays.sort(c);
     System.out.println(Arrays.toString(c));
    
	}
}
