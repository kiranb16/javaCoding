package Serialization_Deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyselfController {
public static void main(String[] args) throws Exception {
	Myself m=new Myself();
	m.name="hello been";
	m.id=12345;
	FileOutputStream f= new FileOutputStream("D:\\serialization\\file.txt");
	ObjectOutputStream obj= new ObjectOutputStream(f);
	obj.writeObject(m);
	f.close();
	obj.close();
	System.out.println("success");
	
}
}
