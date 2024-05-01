package basic;


public class XX{
	  public static void main(String[] args) {
		int re=factorialNumber(5);
		System.out.println(re);
	}

	private static int factorialNumber(int i) {
		if(i==0) {
			return 1;
		}
		return factorialNumber(i-1)*i;
	}
}