package Assignments;

import java.util.Scanner;

public class Assignments_2 {

	public static void main(String[] args) {
		
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the multiplication table - ");
		int n=sc.nextInt();
		for (c=1;c<=20;c++)
		{
			System.out.println(n+" * "+c+" = "+n*c);
		}

	}

}
