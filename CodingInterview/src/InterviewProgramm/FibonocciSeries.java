package InterviewProgramm;

import java.util.Scanner;

public class FibonocciSeries {
public static void main(String[] args) {
	int n1= 0, n2=1;
	int sum=0;
	System.out.println("enter count");
	Scanner sc= new Scanner(System.in);
	int count= sc.nextInt();
	System.out.println(n1+"  "+n2);
   

	for(int i=2 ; i< count; i++) {
		sum= n1+n2;
		System.out.println(" "+sum);
		n1=n2;
		n2= sum;
	}
	
}
}
