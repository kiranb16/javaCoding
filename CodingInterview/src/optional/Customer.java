package optional;

import java.util.List;

public class Customer {
 int id; 
 String name;
 String email;
 List<Integer> phoneNo;
public Customer(int id, String name, String email, List<Integer> list) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phoneNo = list;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Integer> getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(List<Integer> phoneNo) {
	this.phoneNo = phoneNo;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
}

}
