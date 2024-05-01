package Serialization_Deserialization;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	String password;
	public Student(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
}
