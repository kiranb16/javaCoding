package core;

import java.util.Arrays;

public class UniqueMergeArrayExample {
	public static void main(String[] args) {
       int a[]= {1,3,4,5,6,7};
       int b[]= {2,3,4,5,6,7};
       
       int c[]= new int[a.length+b.length];
       
       for(int i=0;i<a.length; i++) {
    	   c[i]=a[i];
       }
       
       for(int i=0; i<b.length;i++) {
    	   for(int j=i+1;  j<b.length;j++) {
    		   if(c[a.length+i]!=c[a.length+j]) {
    			   c[a.length+i]=b[i];
    			  
    		   }
    	   }
    	   
    	   
       }
       System.out.println(Arrays.toString(c));
    
	}
}
