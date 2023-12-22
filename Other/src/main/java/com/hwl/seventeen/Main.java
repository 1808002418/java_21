package com.hwl.seventeen;

public class Main {
	public static void main(String[] args) {
		testSwitch();
	}

	private static void testSwitch() {
//		Animal animal = new Cat();
		Animal animal = null;

		switch (animal) {
			case Cat cat:
				cat.eat();
				break;
			case Dog dog:
				dog.eat();
				break;
			case null:
				System.out.println("空对象");
				break;
			default:
				animal.eat();
		}
	}
}
