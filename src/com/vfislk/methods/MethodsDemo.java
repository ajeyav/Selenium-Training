package com.vfislk.methods;

public class MethodsDemo {

	// access modifier static returntype methodname(arguments)

	public static double areaOfCircle(int r) {
		double area = 3.142 * r * r;

		return area;

	}
	
	public static int areaOfRectangle(int length, int breadth)
	{
		return length*breadth;
	}
	
	public static double areaOfTriangle (int base, int height)
	{
		return 0.5*base*height;
	}
	//classname.methodname()
	
	public static void main(String[] args) {

		int r=10;	
		double R= MethodsDemo.areaOfCircle(r);
		System.out.println(R);
		
		int length = 40;
		int breadth = 50;
		int res = MethodsDemo.areaOfRectangle(length, breadth);
		System.out.println(res);
		
		int base =25;
		int height =1;
		double resTriangle = MethodsDemo.areaOfTriangle(base, height);
		System.out.println(resTriangle);
	}
	
	
/*
	public static void main(String[] args) {

		int radius = 10;

		double result = (22 / 7) * radius * radius;

		System.out.println(result);
		System.out.println((double) 22 / 7);
	}
*/
}
