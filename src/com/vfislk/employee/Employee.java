package com.vfislk.employee;

public class Employee {

	public String empName;
	public double empSalary;
	public static String companyName;
	public int empID;
	
	public  Employee(int no)
	{
		empID=no;
	}
/*
	public static void printEmployeeDetail(Employee emp) {
		System.out.println(emp);
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(Employee.companyName);
	}
*/
	public void pritnEmployeeDetail() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
	}
	/*
	public static Employee createInstance()
	{
		Employee e=new Employee();
		return e;
	}
	*/
}
