package Assignments;

import java.util.Scanner;

public class Assignments_3 {

	public static void main(String[] args) {
		
		int num=0,a1, b;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the value until which you want the even sum - ");
		a1=k.nextInt();
		
		for (b=0;b<=a1;b++)
		{
			if (b%2==0)
			{
				num=num + b;
			}
			
		}
		System.out.println("The final sum is "+num);
	}

}
