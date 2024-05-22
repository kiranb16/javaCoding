package interview;

public class ClassCastExceptionExp  {
 public static void main(String[] args) {
		try{Object o= new Object();
		String s= (String)o;
		System.out.println(s);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Object obj= new String("Hello World");
		//System.out.println((Integer)obj);
		//innstanceof used to handle classCastException
		if(obj instanceof Integer) {
			System.out.println((Integer)obj);
		}else {
			System.out.println(obj);
		}
		
		
}
}
