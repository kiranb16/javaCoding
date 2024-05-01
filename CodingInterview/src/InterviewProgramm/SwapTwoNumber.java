package InterviewProgramm;

public class SwapTwoNumber {
public static void main(String[] args) {
	int a=10, b=20 ;
	System.out.println(" before swapping: "+a+" "+b);
	//By third variable;
	
	/*
	int c=a;
	a=b;
	b=c;
	System.out.println("after swapping : "+a+" "+b);
	*/
	
	//logic 2 without using Third variable;
	/*
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping : "+a+" "+b);
	*/
	
   //logic third with * & /
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("after swapping : "+a+" "+b);
}
}
