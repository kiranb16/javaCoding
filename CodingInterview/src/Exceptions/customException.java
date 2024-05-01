package Exceptions;
class InvalidAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String msg) {
		System.out.println(msg);
	}
	
}

public class customException{
	 public static void main(String[] args) {
		try {
			vote(10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void vote(int age) throws InvalidAgeException {
		if(age<18){
			
			throw new InvalidAgeException("not eligible for vote");
		}else {
			System.out.println(" eligible for vote");
		}
	}
}