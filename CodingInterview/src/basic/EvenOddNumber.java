package basic;

public class EvenOddNumber {
	// Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing integer variable
        // to be checked
        int n = 51;
 
        // Condition check
        // if n|1 if greater than n then this number is even Bitwise OR(|)
        if ((n | 1) > n) {
 
            // Print statement
            System.out.println("Number is Even");
        }
        else {
 
            // Print statement
            System.out.println("Number is Odd");
        }
    }
}
