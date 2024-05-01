package Exceptions;

public class ArrayInexOutOfBoundsExample2 {
public static void main(String[] args) {
	try{int a[]= new int[-1];
	System.out.println(a);// NegativeArraySizeException
	}catch(NegativeArraySizeException e) {
		System.out.println("NegativeArraySizeException catched");
	}
}
}
