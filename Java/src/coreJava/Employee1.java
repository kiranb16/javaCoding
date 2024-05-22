package coreJava;

import java.io.Serializable;

public class Employee1 implements Serializable {
private int id;
private String name;
public Employee1() {
	
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


}