package Serialization_Deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args)  {
		try{
			Student s = new Student(555, "Kiran Batwal", "99887");
		
			FileOutputStream fout= new FileOutputStream("D:\\serialization\\file.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(s);
			fout.close();
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
