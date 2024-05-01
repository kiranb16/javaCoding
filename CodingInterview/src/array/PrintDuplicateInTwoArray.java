package array;

public class PrintDuplicateInTwoArray {
  public static void main(String[] args) {
	  int a[]= new int[] {1,2,3,4,5,3};
	  int b[]= new int[] {1,4,5,6,};
	    int i, j;
	  for(i=0; i<a.length;i++) {
		  for(j=0; j<b.length; j++) {
			  if(a[i]==b[j]) {
				  System.out.println(a[i]);
			  }
		  }
	  }
	
}
}
