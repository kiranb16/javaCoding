package core;
class Student{
	int id;
	String name;
 static String college="ssc";
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	static void change() {
		college="Pune University";
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
}
public class StaticTest {
 public static void main(String[] args) {
	Student.change();
	Student st= new Student(100,"Kiran");
	Student st1= new Student(111,"RaviKiran");
	st.display();
	st1.display();
	
}
}
