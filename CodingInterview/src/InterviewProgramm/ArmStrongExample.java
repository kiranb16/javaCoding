package InterviewProgramm;

public class ArmStrongExample {
	public static void main(String[] args) {

		int n = 153;
		int c=n;
		int arm=0;
		while(n>0) {
			int rem=n%10;
			arm=arm+(rem* rem*rem);
			n=n/10;
		}
		System.out.println(arm);
		
		if(c==arm) {
			System.out.println("armStrong");
		}else {
			System.out.println(" not ");
		}
	}

}
