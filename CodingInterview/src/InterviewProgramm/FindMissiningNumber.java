package InterviewProgramm;

public class FindMissiningNumber {
 public static void main(String[] args) {
	 int a[]= {1,2,4,5};
	 int sum1=0;
	 for(int i=0;i<a.length; i++) {
		 sum1= sum1+a[i];
	 }
	 System.out.println("sum of array : "+sum1);
	 
	 int sum2=0;
	 for( int i=1;i<=5;i++) {
		 sum2=sum2+i;
	 }
	 System.out.println("sum of element of array :"+sum2);
	 
	 int s=sum2- sum1;
	 System.out.println("missing no of array is  :"+s);
}
}
  