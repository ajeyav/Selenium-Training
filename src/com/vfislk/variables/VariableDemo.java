package com.vfislk.variables;

public class VariableDemo {

	public static int a1 = 10;// Static variable or class variable
	public int a2 = 10; // Non-Static variable or instance variable

	public static void main(String[] args) {

		System.out.println(VariableDemo.a1);

		VariableDemo obj1 = new VariableDemo();
		VariableDemo obj2 = new VariableDemo();

		obj2.a1 = 20;
		obj2.a2 = 50;

		obj2 = obj1; // Values of obj2 variables will be the same as obj1
		
		obj2.a2=150; //Since both obj1 & obj2 points to the same location, when data of a variable is changes in obj2, obj1 also gets changed.
		
		System.out.println(obj1.a1);
		System.out.println(obj1.a2);

		System.out.println(obj2.a1);
		System.out.println(obj2.a2);

	}

}
