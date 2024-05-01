package InterviewProgramm;

import java.util.Scanner;

public class BiggestNumber {
  public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	int b=sc.nextInt();
	int c= sc.nextInt();
	if(a>b && a>c ) {
		System.out.println(a+": is largest number");
	}else if(b>a && b>c) {
		System.out.println(b+": is largest number");
	}else {
		System.out.println(c+": is largest number ");
	}
}
}
