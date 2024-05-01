package core2;

import java.util.Scanner;

public class ArmStrongNumber2 {
  public static void main(String[] args) {
	System.out.println(" Enter the number");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int rem, c,arm=0;
	c=n;
	while(n>0) {
		rem= n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(c==arm) {
		System.out.println(c+"  is armstrong");
	}else {
		System.out.println(c+" not armStrong number");
	}
}
}
