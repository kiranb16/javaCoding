package InterviewProgramm;

public class SumOfArray {
public static void main(String[] args) {
	int a[]= {2,4,6,7,9};
	int sum=0;
	for(int i=0; i<a.length; i++) {
		sum=sum+a[i];
	}
	System.out.println("sum of Integer : "+sum);
}
}
