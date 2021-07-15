package com.vfislk.employee;

public class Employee {

	public String empName;
	public double empSalary;
	public static String companyName;
	public int empID;

	public static void printEmployeeDetail(Employee emp) {
		System.out.println(emp);
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(Employee.companyName);
	}

}
