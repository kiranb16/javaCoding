package Exceptions;


public class XX{
	public static void main(String[] args) {
		try {
		String s="Kiran";
		Integer a=Integer.parseInt(s);
		System.out.println(a);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

/*
//String s="Seven";
	try{int num= Integer.parseInt("Akki");
	System.out.println(num);
	}catch(NumberFormatException e) {
		System.out.println("NumberFormatException  catched");
	}
}
*/