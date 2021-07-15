package com.vfislk.employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee.companyName = "VFISLK";

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.empID = 101;
		emp1.empName = "John";
		emp1.empSalary = 1000;

		emp2.empID = 102;
		emp2.empName = "Mark";
		emp2.empSalary = 3000;

		System.out.println(emp1);
		Employee.printEmployeeDetail(emp1);

		System.out.println(emp2);
		Employee.printEmployeeDetail(emp2);

		/*
		 * System.out.println("----------------------------------");
		 * System.out.println(emp1.empID); System.out.println(emp1.empName);
		 * System.out.println(emp1.empSalary);
		 * System.out.println(emp1.companyName);
		 */

		/*
		 * System.out.println("----------------------------------");
		 * System.out.println(emp2.empID); System.out.println(emp2.empName);
		 * System.out.println(emp2.empSalary);
		 * System.out.println(emp2.companyName);
		 */
		/*
		Employee[] employees=new Employee[2];
		employees[0]=emp1;
		employees[1]=emp2;
		*/
	}

}
