package InterviewProgramm;

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
	  System.out.println("Enter the number");
	Scanner sc= new Scanner(System.in);
	
	int num=sc.nextInt();
	/*
	int rev=0;
	while(num!=0) {
		rev=rev*10+ num%10;
		num=num/10;
	}
	System.out.println("reverse number is :"+rev);
	*/
   // by using StringBuffer class
	/*
	StringBuffer sb= new StringBuffer(String.valueOf(num));
	  StringBuffer rev=sb.reverse();
	  System.out.println("reverse number is : "+rev);
	  
	  */
	//  Using StringBuilder class
	
	StringBuilder sb1= new StringBuilder();
	sb1.append(num);
	StringBuilder rev=sb1.reverse();
	System.out.println("reverse number :"+rev);
	
}
}
