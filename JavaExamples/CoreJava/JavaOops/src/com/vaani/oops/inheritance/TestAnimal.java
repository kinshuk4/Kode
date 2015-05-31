package com.vaani.oops.inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		// It is ok.. since Bird is a subclass to Animal
		Animal animal = new Bird();
		animal.eat();
		
		// this is not allowed as dog is subclass to Animal
		//Dog dog = new Animal();
		
		Bird bird = new Bird();
		bird.fly();
	}
}
