package basic;

import java.util.Scanner;

public class PowerCalculation {
 public static void main(String[] args) {
	int i, p , result=1;
	System.out.println("enter the number and its power");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	p=sc.nextInt();
	
	for(i=1;i<=p;i++) {
		  result=n*result;
	}
	System.out.println("power is :"+result);
}
}