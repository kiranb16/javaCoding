package basic;

public class SumOfDigitOfNumber {
public static void main(String[] args) {
	/*int a=123;
	int sum=0;
	if(a!=0) {
		sum=sum+a%10;
		a=a/10;
	}
	System.out.println(sum);
	
	*/
	int a=444;
	int sum=0;
	while(a>0) {
		sum=sum+a%10;
		a=a/10;
		
	}
	System.out.println(sum);
}
}
