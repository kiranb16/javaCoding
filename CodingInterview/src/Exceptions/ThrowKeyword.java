package Exceptions;

public class ThrowKeyword {
	void method() throws Exception {
		Exception ex= new Exception();
		throw ex;
	}
	public static void main(String[] args) {
		/*
		 * try { NumberFormatException e = new NumberFormatException(); throw e;// throw
		 * exception manually } catch (NumberFormatException e) {
		 * System.out.println("null poiter exception handled"); }
		 */
	}
}
