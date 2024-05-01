package InterviewProgramm;

public class PrimeExample {
  public static void main(String[] args) {
	
	  int n1=1,n2=100;
	  
	  for(int i=n1; i<=n2; i++) {
		  for(int j=2; j<=i;j++ ) {
			  if(i%j==0) {
				  break;
			  }
			  if(i==j) {
				  System.out.println(j);
			  }
		  }
		 
	  }
}
}
