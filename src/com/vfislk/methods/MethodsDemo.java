package com.vfislk.methods;

public class MethodsDemo {

	// access modifier static returntype methodname(arguments)

	
	// classname.methodname()

	public static void main(String[] args) {

		int r = 10;
		double R = Area.areaOfCircle(r);
		System.out.println(R);

		int length = 40;
		int breadth = 50;
		int res = Area.areaOfRectangle(length, breadth);
		System.out.println(res);

		Methods_Non_Static_Demo obj = new Methods_Non_Static_Demo();//This allocates memory for all non-static fields/methods
		
		int base = 25;
		int height = 1;
		double resTriangle = obj.areaOfTriangle(base, height);
		System.out.println(resTriangle);
		
		Area.printClassDetail();
		
		String name=obj.getAuthorName();
		System.out.println(name);
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * int radius = 10;
	 * 
	 * double result = (22 / 7) * radius * radius;
	 * 
	 * System.out.println(result); System.out.println((double) 22 / 7); }
	 */
}
