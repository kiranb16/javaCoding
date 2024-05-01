package core2;

class Boy{
	int id;
	String name;
	public Boy(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + "]";
	}
	static class Child{
		 String father;
		 String mother;
		 
		 void display() {
			 System.out.println(father+" "+mother);
		 }

		public Child(String father, String mother) {
		
			this.father = father;
			this.mother = mother;
		}

		@Override
		public String toString() {
			return "Child [father=" + father + ", mother=" + mother + "]";
		}
		
	}
}
public class StaticInnerClass {
  public static void main(String[] args) {
	Boy b = new Boy(555,"Kiran");
	Boy.Child c= new Boy.Child("Vasant","Kausalya");
	System.out.println(b+" "+c);
	
   
}
}














