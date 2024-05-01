package InterviewProgramm;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String org= str;
		String rev="";
		char [] a= str.toCharArray();
		 int n= a.length;
		 for(int i= n-1; i>=0;i--) {
			 rev= rev+ str.charAt(i);
		 }if(org.contentEquals(rev)) {
			 System.out.println("string is pallindrome :"+rev);
		 }else System.out.println(" string is not pallindrome :"+rev);

	}
}
