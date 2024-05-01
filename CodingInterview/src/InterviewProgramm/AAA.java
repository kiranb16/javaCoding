package InterviewProgramm;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Emp{
	int id;
	String name;

  public Emp(int id, String name) {
	  this.id=id;
	  this.name=name;
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
}
	
}
public class AAA{
	 public static void main(String[] args) {
		try {
		 Emp e= new Emp(123, "Kiran");

			FileOutputStream fout= new FileOutputStream("D:\\serialization\\file.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(e);
			fout.close();
			out.close();
			System.out.println("success");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

















