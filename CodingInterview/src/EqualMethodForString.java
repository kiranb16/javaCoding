
public class EqualMethodForString{

	public static void main(String[] args) {
		String s = "kiran";

		StringBuilder s3 = new StringBuilder("kiran");

		System.out.println("condition " + ("Scp and builder :"+s.equals(s3)));
		
		StringBuffer sb= new StringBuffer("kiran");
		
		System.out.println("condition for equal :"+s.equals(sb));
		//System.out.println("condition for equal :"+s3==(sb)); compile time error
		
	}
}
