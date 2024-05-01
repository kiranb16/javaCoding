package basic;

public class ReplaceNumbersWithHatch {
 public static void main(String[] args) {
	String phone="9960688287";
	String regex=phone.replaceAll(".(?=.{3})", "#");
	System.out.println(regex);
}
}
