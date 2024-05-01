package core;

public class StringRotation {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CADB";
		
		if(isRotation(str1, str2)) {
			System.out.println("rotation of String is present");
		}else {
			System.out.println("rotation of String is not  present");
		}
	}
	

	public static boolean isRotation(String str1, String str2) {
		return (str1.length() == str2.length() && (str1 + str1).indexOf(str2) != -1);
	}
}
