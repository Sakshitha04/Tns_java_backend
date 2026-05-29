package org.tnsif.inheritence;

class Animal {
	
	void Sound() {
		System.out.println("animal sounds");
	}
}

class Dog extends Animal{
	
	void Bark() {
		System.out.println("Barks")
	}
}

public class Task {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.Sound();
		dog.Bark();

	}

}
