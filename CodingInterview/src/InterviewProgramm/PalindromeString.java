package InterviewProgramm;

import java.util.Scanner;

public class PalindromeString {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	  System.out.println("Enter your String");
	   String str= sc.next();
	   String org_str=str;
	   String rev="";
	   int len= str.length();
	   for(int i= len-1; i>=0; i--) {
		   rev= rev+str.charAt(i);
		   
	   }
	   System.out.println(rev);
	   if(rev.equals(org_str)) {
		   System.out.println("it is pallindrome String");
	   }else System.out.println("it is not pallindrome String");
}
}
