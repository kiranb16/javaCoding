package InterviewProgramm;

import java.util.Scanner;

public class NumberOfEvenAndOdd {
 public static void main(String[] args) {
	 System.out.println("enter the number");
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int  evenCount=0;
	int oddCount=0;
	
	while(n>0) {
		 int rem= n%10;
		 if(rem%2==0) {
			 evenCount++;
		 }else {
			 oddCount++;
		 }
		 n=n/10;
	}
	
	System.out.println("even numbers are :"+ evenCount);
	System.out.println("odd numbers are :"+ oddCount);
}
}
