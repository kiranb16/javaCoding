package basic;

public class OtpGeneration {
public static void main(String[] args) {
	/*
	int random= (int)(Math.random()*8000)+2000;
	 String otp=String.valueOf(random);
	 System.out.println("OTP :"+otp);
	 */
	int random= (int) ((Math.random()*9000)+2000);
	String otp= String.valueOf(random);
	System.out.println(otp);
	
	int ran=(int) (Math.random()*12+2000);
	String ot=String.valueOf(ran);
	System.out.println(ot);
}
}
