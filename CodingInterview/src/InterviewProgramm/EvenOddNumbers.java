package InterviewProgramm;

public class EvenOddNumbers {
	public static void main(String[] args) {
		int a[] = { 13, 2, 4, 5, 7, 9, 6, 24,  };
		
		System.out.println("odd numbers");
		for( int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("even number");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}
