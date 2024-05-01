package Java8Example;

import java.util.stream.IntStream;

public class  DiamondPatternExample {
  public static void main(String[] args) {
	  int i,j,k;
	  for( i=1; i<=5;i++) {
		  for(j=5; j>i; j--) {
			  System.out.print(" ");
		  }
		  for(k=1; k<=2*i-1; k++) {
			  System.out.print("*");
		  }
		  System.out.println();
		  
	  }
	  // copying above loop and pested  only first reverse
	  for( i=5; i>=1;i--) {
		  for(j=5; j>i; j--) {
			  System.out.print(" ");
		  }
		  for(k=1; k<=2*i-1; k++) {
			  System.out.print("*");
		  }
		  System.out.println();
		  
	  }
	
}
}
