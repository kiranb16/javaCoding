package coreJava;

public class Employee {
private int empid;
private String empName;
private int deptid;
private String status="active";
private int salary;
public Employee(int empid, String empName, int deptid, String status, int salary) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.deptid = deptid;
	this.status = status;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", deptid=" + deptid + ", status=" + status
			+ ", salary=" + salary + "]";
}


}
