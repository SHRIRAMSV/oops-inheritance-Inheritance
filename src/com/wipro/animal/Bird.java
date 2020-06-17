package com.wipro.animal;

public class Bird extends Animal {

	public void eat() {
		System.out.println("Inside eat method of bird class");
	}

	public void sleep() {
		System.out.println("Inside sleep method of bird class");
	}

	public void fly() {
		System.out.println("Inside fly method of bird class");

	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}
