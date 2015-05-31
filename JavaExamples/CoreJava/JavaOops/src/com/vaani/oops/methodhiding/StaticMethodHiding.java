package com.vaani.oops.methodhiding;

class Animal {
    public static void foo() {
        System.out.println("Animal");
    }
	
}

class Cat extends Animal{
    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }
}
/***
 * help - http://stackoverflow.com/questions/16313649/what-is-method-hiding-in-java-even-the-javadoc-explantion-is-so-confusing
 * @author kchandra
 *
 */
public class StaticMethodHiding {
	public static void main(String[] args) {
		Animal.foo(); // prints Animal
		Cat.foo(); // prints Cat

		Animal a = new Animal();
		Animal b = new Cat();
		Cat c = new Cat();
		Animal d = null;

		a.foo(); // should not be done. Prints Animal
		b.foo(); // should not be done. Prints Animal because the declared type of b is Animal
		c.foo(); // should not be done. Prints Cat because the declared type of c is Cat
		d.foo(); // should not be done. Prints Animal because the declared type of b is Animal
	}
}
