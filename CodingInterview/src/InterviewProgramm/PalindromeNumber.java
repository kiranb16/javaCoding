package InterviewProgramm;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println(" please Enter number ");
	 int n= sc.nextInt();
	   int orgNumber=n;
	   int rev=0;
	   while(n!=0) {
		   rev= rev*10+n%10;
		   n=n/10;
	   } if( orgNumber==rev) {
	   System.out.println("palindrome number is:"+rev);
	   }else {
		   System.out.println(rev+" is not palindrome number");
	   }
}
}
