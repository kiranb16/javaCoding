package Java8Example;

public class ReplaceString {
	public static void main(String[] args) {
		String str = "cloudtech";

		int n = str.length();
		String fstr = "";
		for (int i=n-1; i>=0;i--) {
			if (str.charAt(i) != 'c') {
				fstr = fstr + str.charAt(i);
			}

		}
	
		System.out.println(fstr);	}
}
