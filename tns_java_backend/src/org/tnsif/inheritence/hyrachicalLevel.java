package org.tnsif.inheritence;

class Parent {
	
	void Property() {
		System.out.println("Property of mr.Xyz");
	}
}

class Son extends Parent {
	
	void HisShare () {
		System.out.println("Son's share : 50%");
	}
}

class Daughter extends Parent {
	
	void HerShare () {
		System.out.println("Daughter's share : 50%");
	}
}

public class hyrachicalLevel {

	public static void main(String[] args) {
		Son son = new Son();
		Daughter daughter = new Daughter();
		son.HisShare();
		son.Property();
		daughter.HerShare();
		daughter.Property();

	}

}
