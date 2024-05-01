package basic;


public class FactorialNumber1{
	public static void main(String[] args) {
	
		int y= factorialNumber(4);
		System.out.println(y);
	}
	public static int factorialNumber( int n) {
		if(n==0) {
			return 1;
		}
		 return factorialNumber(n-1)*n;
	}
}
