package com.vfislk.logics;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=70;
		
		if(mark>=90){
			System.out.println("Grade A");
		}
		else if(mark<90 && mark>=80){
			System.out.println("Grade B");
		}
		else if(mark<80 && mark>=70){
			System.out.println("Grade C");
		}
		else if(mark<70 && mark>=60){
			System.out.println("Grade D");
		}
		else if(mark<60 && mark>=50){
			System.out.println("Grade E");
		}
		else if(mark<50 && mark>=35){
			System.out.println("PASS");
		}
		else if(mark<35 && mark>=0){
			System.out.println("FAIL");
		}
		else {
			System.out.println("Enter valid marks");
		}
	}

}
