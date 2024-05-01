package InterviewProgramm;

import java.util.Arrays;

public class IsTwoArrayAreSame {

	public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int a2[]= {1,2,3,4,6};
	boolean status= Arrays.equals(a1, a2);
	
	if (status== true) {
	  System.out.println("arrays are equal");	
	}
	if (status!= true) {
		  System.out.println("arrays are  not equal");	
		}
}
	
}
