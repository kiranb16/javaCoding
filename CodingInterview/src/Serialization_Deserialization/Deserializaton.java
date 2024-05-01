package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializaton {
 public static void main(String[] args) {
	try {
		FileInputStream fin= new FileInputStream("D:\\serialization\\file.txt");
		ObjectInputStream in= new ObjectInputStream(fin);
		Student s1= (Student) in.readObject();
		in.close();
		fin.close();
		System.out.println(s1.id+" "+s1.name+" "+s1.password);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
