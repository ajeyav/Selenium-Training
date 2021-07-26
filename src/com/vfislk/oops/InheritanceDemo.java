package com.vfislk.oops;

class Parent {
	public int pAge;

	public Parent() {
		pAge = 45;
	}

	public void paretntStyle() {
		System.out.println("parentStyle");
	}
}

class Child extends Parent {
	public int cAge;

	public Child() {
		cAge = 25;
	}

	public void childStyle() {
		System.out.println("childStyle");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.cAge);
		System.out.println(c.pAge);

		c.paretntStyle();
		c.childStyle();

		Parent p = new Parent();
		System.out.println(p.pAge);
		p.paretntStyle();
	}

}
