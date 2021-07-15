package Assignments;

import java.util.Scanner;

public class Assignments_1 {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("Here's the odd numbers less than 30");
		for (i = 0; i <= 30; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("Here's the even numbers less than 30");
		for (i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

		int a, b, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit - ");
		k = sc.nextInt();
		a = 0;
		b = 1;
		System.out.println("List of even numbers - ");
		while (a <= k) {
			System.out.println(a + " ");
			a = a + 2;
		}
		System.out.println("List of odd numbers - ");
		while (b <= k) {
			System.out.println(b + " ");
			b = b + 2;
		}
	}

}
