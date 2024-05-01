package basic;

public class Student implements Cloneable {
 int id;
 String name;
 
 Student(int id, String name){
	 this.id= id;
	 this.name=name;
 }
 

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
  public static void main(String[] args) {
	Student s= new Student(555, "Kiran");
	try {
		Student s2= (Student) s.clone();
		System.out.println(s);
		System.out.println(s2);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
}
