package core2;

public class ArmStrongNumber {
 public static void main(String[] args) {
	int input=5;
	if(isArmStrongNumber(input)) {
		System.out.println(" number is armStromng");
	} else {
		System.out.println("not armStrong number");
	}
	
}

public static boolean isArmStrongNumber(int input) {
    int j= input;
    int sum=0;
    int digit=0;
    while(j>0) {
    	digit=j%10;
    	j=j/10;
    	sum=sum+digit*digit*digit;
    }
	return input==sum;
}
}
