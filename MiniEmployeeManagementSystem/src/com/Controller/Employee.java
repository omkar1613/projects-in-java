package com.Controller;

public class Employee {
	private String Emp_name;
	private int Emp_id;
	private  DepartmentDetails Dept;
	private Managerdetails Mng;
	
	public Employee(String emp_name, int emp_id, DepartmentDetails dept, Managerdetails mng) {
		
		Emp_name = emp_name;
		Emp_id = emp_id;
		Dept = dept;
		Mng = mng;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public DepartmentDetails getDept() {
		return Dept;
	}

	public void setDept(DepartmentDetails dept) {
		Dept = dept;
	}

	public Managerdetails getMng() {
		return Mng;
	}

	public void setMng(Managerdetails mng) {
		Mng = mng;
	}

	
	
	

}
