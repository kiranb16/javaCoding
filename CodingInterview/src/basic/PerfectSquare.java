package basic;

import java.util.Scanner;

public class PerfectSquare {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	  Integer num=sc.nextInt();
	  for(int i=0; i<num; i++) {
		  if(i*i==num) {
			  System.out.println("given number is square of "+i);
		  }
	  }
}
}
