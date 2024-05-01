package basic;

public class ReverseNumber {
public static void main(String[] args) {
	int number=1234;
    int reverse;
    StringBuilder str= new StringBuilder(String.valueOf(number));
    reverse=Integer.valueOf(str.reverse().toString());
    System.out.println(reverse);
}
}
