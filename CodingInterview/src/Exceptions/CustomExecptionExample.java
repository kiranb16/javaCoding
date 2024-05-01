package Exceptions;


class invalidAgeException extends Exception{

	public invalidAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class CustomExecptionExample{
	
	      
	 public static void main(String[] args) throws invalidAgeException {
		vote(16);
	}

	private static void vote(int i) throws invalidAgeException {
		// TODO Auto-generated method stub
		if(i<18) {
			throw new invalidAgeException(" invalid age for voting ");
		}else {
			System.out.println(" congratulations");
		}
	}
}