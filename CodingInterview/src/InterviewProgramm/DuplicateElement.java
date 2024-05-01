package InterviewProgramm;

public class DuplicateElement {
	public static void main(String[] args) {
		String arr[] = { "java", "c", "c++", "python", "java","java"};
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("duplicate elemnet Found :" + arr[i]);
					flag = true;
					break;
				}
			}
		}
		if(flag== false) {
			System.out.println("duplicate element not found ");
		}
	
	}
}
