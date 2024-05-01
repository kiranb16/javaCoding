package core3;

class Animal{
	private String colour="White";


	public String getColour() {
		return colour;
	}
	
}
public class privateVariableExample {
  public static void main(String[] args) {
	Animal a= new Animal();
   System.out.println(a.getColour());
}
   
}
