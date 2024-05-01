package basic;

public class HcfOfTwoNumbers2 {
	// Java program to find GCD of two
	// numbers using Euclidean algorithm
	
		// Function to return gcd of x and y
		// recursively
		static int GCD(int x, int y)
		{
			if (y == 0)
				return x;
			return GCD(y, x % y);
		}

		// The Driver code
		public static void main(String[] args)
		{
			int x = 15, y = 20;
			System.out.println("The GCD of " + x + " and " + y
							+ " is: " + GCD(x, y));
		}
	}

/*
 * static int GCD(int u, int v)
		{
			if (u == 0)
				return v;
			return GCD(v % u, u);
		}
 
*/
