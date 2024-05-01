package core;

class invalidageException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public invalidageException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class ExceptionTest{
	public static void main(String[] args) {
		try {
			vote(56);
		} catch (invalidageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void vote(int age) throws invalidageException {
		 if(age<18) {
			 throw new invalidageException(" not valid for vote");
		 }else {
			 System.out.println("valid for vote");
		 }
	}
}