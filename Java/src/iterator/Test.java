package iterator;

public class Test {
	public static void main(String[] args) {

		String str1 = "Kiran";
		String str2 = "Batwal";
		System.out.println("before Swapping str1 :" + str1);
		System.out.println("before Swapping str2 :" + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);


	}
}
