package InterviewProgramm;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt() ;
		int count = 0;
		if (num > 1) {
                     for(int i=1; i<=num; i++) {
                    	  if(num% i==0) {
                    		  count++;
                    	  }if(count==2) {
                    		  System.out.println(num+" is prime number");
                    	  }
                     }
			
		} else {
			System.out.println(num + " is not prime number");
		}
	}

}
