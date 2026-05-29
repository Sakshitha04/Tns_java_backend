package org.tnsif.inheritence;

class Course { // Parent class
	String courseName = "java backend";
	
	void showCourse() {
		System.out.println("Course : "+courseName);
	}
}

class Student extends Course { // Child class
	String stdName = "amit";
	
	void showStudent() {
		System.out.println("student name : "+stdName);
	}
}

public class singleLevel { // Main Class

	public static void main(String[] args) {
		
		Student std = new Student();
		std.showCourse();
		std.showStudent();

	}

}
