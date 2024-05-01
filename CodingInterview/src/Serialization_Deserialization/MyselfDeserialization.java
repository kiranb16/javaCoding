package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyselfDeserialization {
	
 public static void main(String[] args) throws Exception{
	 FileInputStream file= new FileInputStream("D:\\serialization\\file.txt");
	 ObjectInputStream obj= new ObjectInputStream(file);
	 Myself m1= (Myself) obj.readObject();
	 obj.close();
	 file.close();
	 System.out.println(m1.name+" "+m1.id);
}
}
/*
ublic class Deserializaton {
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
*/